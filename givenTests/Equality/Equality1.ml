type 'a option = None | Some of 'a ;;

None = None
;;
(* - : bool = true *)

Some 1 = Some 2
;;
(* - : bool = false *)

Some None = Some None
;;
(* - : bool = true *)

Some 1 = None
;;
(* - : bool = false *)
