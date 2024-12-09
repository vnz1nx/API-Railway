CREATE TABLE cortes (
    id SERIAL PRIMARY KEY,
    nomeCorte VARCHAR(100) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL,
    tempo VARCHAR(30) NOT NULL,
    imagem VARCHAR(255), 
    barber_id INT NOT NULL,
    FOREIGN KEY (barber_id) REFERENCES barber(id) ON DELETE CASCADE
);
