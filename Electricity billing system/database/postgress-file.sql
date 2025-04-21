-- Users (residents)
CREATE TABLE users (
  user_id SERIAL PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  phone_number VARCHAR(15) UNIQUE NOT NULL
);

-- Meters
CREATE TABLE meters (
  meter_id SERIAL PRIMARY KEY,
  user_id INT REFERENCES users(user_id),
  meter_number VARCHAR(20) UNIQUE NOT NULL,
  status BOOLEAN DEFAULT FALSE  -- FALSE = off, TRUE = electricity on
);

-- Transactions (payments)
CREATE TABLE transactions (
  transaction_id SERIAL PRIMARY KEY,
  user_id INT REFERENCES users(user_id),
  meter_id INT REFERENCES meters(meter_id),
  amount DECIMAL(10,2) NOT NULL,
  date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);