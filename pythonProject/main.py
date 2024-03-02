import pygame
import sys

# Initialize Pygame
pygame.init()

# Constants
WIDTH, HEIGHT = 800, 600
WHITE = (255, 255, 255)
BLUE = (0, 0, 255)
FPS = 60
PADDLE_SPEED = 10  # Adjust the paddle speed here
PLAYER1_SCORE_POS = (WIDTH // 4, 50)
PLAYER2_SCORE_POS = (3 * WIDTH // 4, 50)
FONT_SIZE = 36

# Create the game window
screen = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Pong")

# Font initialization
font = pygame.font.SysFont(None, FONT_SIZE)

try:
    paddle1_image = pygame.image.load(r"C:\Users\Zach\Documents\pythonProject\pngtree-hot-dog-food-realistic-element-png-image_5199484.png").convert_alpha()
    paddle2_image = pygame.image.load(r"C:\Users\Zach\Documents\pythonProject\hot-dog-johanna-parkin.jpg").convert_alpha()
    ball_image = pygame.image.load(r"C:\Users\Zach\Documents\pythonProject\ninja.png").convert_alpha()
    paddle_width = 100
    paddle_height = 50
    paddle1_image = pygame.transform.scale(paddle1_image, (paddle_width, paddle_height))
    paddle2_image = pygame.transform.scale(paddle2_image, (paddle_width, paddle_height))

    new_width = 30  # Set the new width
    new_height = 30  # Set the new height
    ball_image = pygame.transform.scale(ball_image, (new_width, new_height))
except pygame.error as e:
    print("Error loading images:", e)
    pygame.quit()
    sys.exit()

# Paddle class
class Paddle(pygame.sprite.Sprite):
    def __init__(self, x, y, image):
        super().__init__()
        self.image = image  # Assign the provided image to self.image
        self.rect = self.image.get_rect()
        self.rect.center = (x, y)

    def update(self):
        keys = pygame.key.get_pressed()
        if keys[pygame.K_UP]:
            self.rect.y -= PADDLE_SPEED
        if keys[pygame.K_DOWN]:
            self.rect.y += PADDLE_SPEED

        # Ensure the paddle stays within the screen boundaries
        self.rect.y = max(self.rect.y, 0)
        self.rect.y = min(self.rect.y, HEIGHT - self.rect.height)


# Ball class
class Ball(pygame.sprite.Sprite):
    def __init__(self, image):
        super().__init__()
        self.original_image = image  # Store the original image
        self.image = self.original_image
        self.rect = self.image.get_rect()
        self.rect.center = (WIDTH // 2, HEIGHT // 2)
        self.angle = 0
        self.rotate_speed = 5
        self.speed_x = 5  # Initial x-axis speed
        self.speed_y = 5

    def update(self):
        # Rotate the image
        self.angle += self.rotate_speed
        self.image = pygame.transform.rotate(self.original_image, self.angle)

        # Update the rectangle position
        self.rect = self.image.get_rect(center=self.rect.center)

        # Move the ball
        self.rect.x += self.speed_x
        self.rect.y += self.speed_y

        # Bounce the ball off the top and bottom edges
        if self.rect.top <= 0 or self.rect.bottom >= HEIGHT:
            self.speed_y *= -1

        # Reset the ball position if it goes off the sides
        if self.rect.left <= 0:
            self.rect.center = (WIDTH // 2, HEIGHT // 2)
            self.speed_x = 5
            self.speed_y = 5
            player2_score.increment()
        elif self.rect.right >= WIDTH:
            self.rect.center = (WIDTH // 2, HEIGHT // 2)
            self.speed_x = -5
            self.speed_y = 5
            player1_score.increment()

# Score class
class Score(pygame.sprite.Sprite):
    def __init__(self, pos):
        super().__init__()
        self.value = 0
        self.pos = pos
        self.image = None
        self.rect = None
        self.update_image()

    def increment(self):
        self.value += 1
        self.update_image()

    def update_image(self):
        self.image = font.render(str(self.value), True, WHITE)
        self.rect = self.image.get_rect()
        self.rect.topleft = self.pos

# Create game objects
# Create game objects
player1 = Paddle(50, HEIGHT // 2, paddle1_image)
player2 = Paddle(WIDTH - 50, HEIGHT // 2, paddle2_image)

ball = Ball(ball_image)
player1_score = Score(PLAYER1_SCORE_POS)
player2_score = Score(PLAYER2_SCORE_POS)

# Create sprite groups
all_sprites = pygame.sprite.Group()
all_sprites.add(player1, player2, ball)

# Main game loop
clock = pygame.time.Clock()
running = True
while running:
    # Handle events
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # Update
    all_sprites.update()

    # Collision detection between ball and paddles
    if pygame.sprite.collide_rect(ball, player1) or pygame.sprite.collide_rect(ball, player2):
        ball.speed_x *= -1

    # Render
    screen.fill(BLUE)
    all_sprites.draw(screen)
    screen.blit(player1_score.image, player1_score.rect)
    screen.blit(player2_score.image, player2_score.rect)
    pygame.display.flip()

    # Cap the frame rate
    clock.tick(FPS)

# Quit Pygame
pygame.quit()
sys.exit()
