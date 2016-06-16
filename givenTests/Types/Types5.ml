type 'a option = None | Some of 'a ;;
(* Type option defined. *)

type r = { x : int , y : r option } ;;
(* Type r defined. *)

let a = { x = 1 , y = Some { x = 2 , y = None } } ;;
(* a : r = {x = 1; y = Some {x = 2; y = None}} *)

a ;;
(* - : r = {x = 1; y = Some {x = 2; y = None}} *)

(a : r) ;;
(* - : r = {x = 1; y = Some {x = 2; y = None}} *)
