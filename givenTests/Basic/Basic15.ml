type 'a option = None | Some of 'a ;;
(* Type option defined. *)

(function None -> 1+2 | Some x -> 1+x) (Some 4) ;;
(* - : int = 5 *)
