CREATE TABLE users (
    user_id INT PRIMARY KEY IDENTITY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL,
    create_date DATE NOT NULL,
    create_by VARCHAR(10) NOT NULL
);

CREATE TABLE roles (
    roles_id INT PRIMARY KEY IDENTITY,
    roles_name VARCHAR(10) NOT NULL,
    create_by VARCHAR(20) NOT NULL,
    create_date DATE NOT NULL
);

CREATE TABLE user_roles (
    user_id INT NOT NULL,
    roles_id INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (roles_id) REFERENCES roles(roles_id)
);