let rec fib n =
  if n < 2 then 1 else (fib (n - 1)) + (fib (n - 2));;

(fib 10) = 89;;
(fib 11) = 144;;
(fib 12) = 233;;
(fib 13) = 377;;
(fib 14) = 610;;
(fib 15) = 987;;
(fib 16) = 1597;;
(fib 17) = 2584;;
(fib 18) = 4181;;
(fib 19) = 6765;;
(fib 20) = 10946;;
(fib 25) = 89;;