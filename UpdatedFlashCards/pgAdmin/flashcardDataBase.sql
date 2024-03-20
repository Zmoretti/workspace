CREATE TABLE Chapter (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE Term (
    id SERIAL PRIMARY KEY,
    term VARCHAR(255) NOT NULL,
    chapter_id INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (chapter_id) REFERENCES Chapter(id)
);

CREATE TABLE Definition (
    id SERIAL PRIMARY KEY,
    term_id INT NOT NULL,
    definition TEXT NOT NULL,
    FOREIGN KEY (term_id) REFERENCES Term(id)
);
