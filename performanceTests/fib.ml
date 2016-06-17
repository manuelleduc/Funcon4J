let rec fib n =
  if n < 2 then 1 else
  ((fib (n - 1)) + (fib (n - 2)));;
(*in let rec loop n =
  if n = 0 then () else
  ((print_int (fib 30));
   (print_newline ());
   (loop (n - 1))) in
loop 100;;*)

let loop n = 
	for i = 0 to n do 
		((print_int (fib 30)); (print_newline ())) 
	done;;

loop 100;;
(*print_float (Sys.time ());;*)