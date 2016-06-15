let rec (foldr : ('a -> 'b -> 'b) -> 'b -> 'a list -> 'b) = fun f u -> function
    []      -> u
  | [x :: xs] -> (f x (foldr f u xs)) ;;
(* foldr : ('a -> 'b -> 'b) -> 'b -> 'a list -> 'b = <fun> *)

foldr (fun x y -> x + y) 0 [ 1 , 2 ] ;;
(* - : int = 3 *)
