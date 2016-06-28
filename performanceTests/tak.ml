let rec tak x y z =
  if y >= x then z else
  (tak (tak (x -. 1.0) y z) (tak (y -. 1.0) z x) (tak (z -. 1.0) x y));;

let n = 9.0;;

print_int (int_of_float (tak (n *. 3.0) (n *. 2.0) (n *. 1.0)));;

(*
let time f x y z=
	let start = Unix.gettimeofday ()
	in let res = f x y z
	in let stop = Unix.gettimeofday ()
	in let () = Printf.printf "Execution time: %fs\n%!" (stop -. start)
	in 
		res;;

for i = 0 to 9 do
	time tak (n *. 3.0) (n *. 2.0) (n *. 1.0)
done;;*)
(*print_float (Sys.time ());;*)