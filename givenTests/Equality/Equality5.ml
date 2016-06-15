type ('a,'b) t1 = C of 'a | D of 'b ;;

C (1,2) = C (1,2)
;;
(* - : bool = true *)

C (1,2) = C (1,3)
;;
(* - : bool = false *)

C (1,2) = D (1,2)
;;
(* - : bool = false *)

C = C
;;
(* Invalid_argument "equal: functional value" *)
