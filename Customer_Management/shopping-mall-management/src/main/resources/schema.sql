CREATE TABLE IF NOT EXISTS customers (
    cust_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(15) NOT NULL,
    membership_type VARCHAR(20) DEFAULT 'Regular',
    loyalty_points INT DEFAULT 0
);
