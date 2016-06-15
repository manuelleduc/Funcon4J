exception Not_found ;;
(* Exception Not_found defined. *)

let rec (assoc : 'a -> ('a * 'b) list -> 'b) = fun x l ->
   match l with
   | [] -> raise Not_found
   | [(y,z)::yzs] -> if x = y then z else (assoc x yzs) ;;
(* assoc : 'a -> ('a * 'b) list -> 'b = <fun> *)

assoc 1 [(0, "zero"), (1, "one")] ;;
(* - : string = "one" *)

try (assoc 2 [(0, "zero"), (1, "one")]) with Not_found -> 0;;
(* Uncaught exception: Not_found *)
