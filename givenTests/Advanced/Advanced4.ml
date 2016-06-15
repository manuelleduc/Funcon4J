(* Based on OL-Test 17 *)

let current_rand = ref 0;;
(* current_rand : int Ref = {contents = 0} *)

let random () =
  current_rand := !current_rand * 25713 + 1345;
  !current_rand;;
(* random : unit -> int = <fun> *)

random ();;
(* - : int = 1345 *)
random ();;
(* - : int = 34585330 *)
random ();;
(* - : int = 889292591635 *)
random ();;
(* - : int = 22866380408712100 *)
random ();;
(* - : int = -2332570909491423067 *)

