 INSERT INTO account (id, user_account_number, account_name, account_type, currency, opening_available_balance, balance_date) VALUES
  (1, '1111111111', 'SGSavings123', 'Savings', 'SGD', '1234567.89', CURRENT_TIMESTAMP()),
  (2, '2222222222', 'AUSavings123', 'Current', 'AUD', '23456.45', CURRENT_TIMESTAMP()),
  (3, '3333333333', 'SGCurrent456', 'Current', 'SGD', '786.45', CURRENT_TIMESTAMP()),
  (4, '4444444444', 'AUCurrent456', 'Current', 'AUD', '12312213.65', CURRENT_TIMESTAMP()),
  (5, '5555555555', 'SGSavings789', 'Savings', 'SGD', '98732498.45', CURRENT_TIMESTAMP()),
  (6, '6666666666', 'AUSavings789', 'Savings', 'AUD', '34587.56', CURRENT_TIMESTAMP()),
  (7, '7777777777', 'AUCurrent789', 'Current', 'AUD', '345.34', CURRENT_TIMESTAMP());
  
  INSERT INTO account_transaction (id, account_number, account_name, transaction_narrative, value_date, currency, credit_amount, debit_amount, transaction_type) VALUES
  (1, '11111aaaaa', 'Current Account', '', CURRENT_TIMESTAMP(), 'SGD', '1237.89', NULL , 'Credit'),
  (2, '22222bbbbb', 'Savings Account', null, CURRENT_TIMESTAMP(), 'AUD', null, '256.45', 'Debit'),
  (3, '33333ccccc', 'Current Account', null, CURRENT_TIMESTAMP(), 'SGD', null, '76.45', 'Debit'),
  (4, '44444ddddd', 'Savings Account', '', CURRENT_TIMESTAMP(), 'AUD', '2213.65', null, 'Credit'),
  (5, '55555eeeee', 'Current Account', '', CURRENT_TIMESTAMP(), 'SGD', '498.45', null, 'Credit'),
  (6, '66666fffff', 'Savings Account', '', CURRENT_TIMESTAMP(), 'AUD', '7.56', null, 'Credit'),
  (7, '77777ggggg', 'Current Account', null, CURRENT_TIMESTAMP(), 'AUD', null, '35.34', 'Debit');
  
 INSERT INTO account_account_transaction_list (account_transaction_list_id, account_id) VALUES
  (1, 1),
  (2, 6),
  (3, 6),
  (4, 4),
  (5, 1),
  (6, 2),
  (7, 1);

  