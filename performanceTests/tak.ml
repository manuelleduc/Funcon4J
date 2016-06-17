let rec tak x y z =
  if y >= x then z else
  (tak (tak (x -. 1.0) y z) (tak (y -. 1.0) z x) (tak (z -. 1.0) x y));;

let n = 10.0;;

print_int (int_of_float (tak (n *. 3.0) (n *. 2.0) (n *. 1.0)));;
print_newline ();;

(*print_float (Sys.time ());;*)