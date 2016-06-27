(*let rec f n i d s =
	if i > n then
		s
	else
		f n (i + 1) (d +. 1.0) (s +. (1.0 /. d));;

print_int (int_of_float (1000000.0 *. (f 100000000 2 2.0 1.0)));
*)
let f n = 
	let s = ref 1.0 in 
	let d = ref 2.0 in 
	(
		for i = 2 to n do 
			(
				s := (!s) +. (1.0 /. !d)
			; 
				d := (!d) +. 1.0
			) 
		done
	;
		!s +. 0.0
	);;

print_float(f 10000000);;
print_newline ();;

(*print_float (Sys.time ());;*)