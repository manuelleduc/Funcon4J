exception Empty_list;;
(* Exception Empty_list defined. *)

let head (l : 'a list) =
  match l with
    [] -> raise Empty_list
  | [hd :: tl] -> hd;;
(* head : 'a list -> 'a = <fun> *)

head [1,2];;
(* - : int = 1 *)

try head [] with Empty_list -> 0;;
(* Uncaught exception: Empty_list *)
