let r = ref true ;;
(* r : bool ref = ref true *)

let u = while !r
        do
          r := false
        done ;;
(* u : unit = () *)

u = () ;;
(* - : bool = true *)
