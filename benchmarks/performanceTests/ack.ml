1;; 2;; 3;;

let rec ack x y =
	if x <= 0 then y + 1 else
	if y <= 0 then ack (x - 1) 1 else
		ack (x - 1) (ack x (y - 1));;

ack 3 10;;
(*
let time f x y =
	let start = Unix.gettimeofday ()
	in let res = f x y
	in let stop = Unix.gettimeofday ()
	in let () = Printf.printf "Execution time: %fs\n%!" (stop -. start)
	in 
		res;;

for i = 0 to 9 do
	time ack 3 10
done;;
*)