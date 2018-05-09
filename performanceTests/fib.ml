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
		((print_int (fib 50)); (print_newline ()))
	done;;

loop 100;;

(*let time f x =
	let start = Unix.gettimeofday ()
	in let res = f x
	in let stop = Unix.gettimeofday ()
	in let () = Printf.printf "Execution time: %fs\n%!" (stop -. start)
	in 
		res;;

for i = 0 to 9 do
	time loop 10
done;;*)
(*print_float (Sys.time ());;*)