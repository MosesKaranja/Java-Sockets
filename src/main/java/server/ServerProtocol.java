package server;

import utils.Request;
import utils.Response;
import utils.Step;

public class ServerProtocol {
    private Step step = Step.ZERO;

    public Response processRequest(Request request) {
        String message = "";
        switch (step) {
            case ZERO:
                System.out.println("Step Zero Details Provided");
                step = Step.ONE;
                break;
            case ONE:
                String[] inputs = request.getMessage().split(",");
                if (inputs.length == 2)
                    step = Step.TWO;
                System.out.println("Step One Details Provided");
                break;
            case TWO:
                inputs = request.getMessage().split(",");
                if (inputs.length == 4)
                    step = Step.THREE;
                System.out.println("Step Two Details Provided");
                break;
            case THREE:
                inputs = request.getMessage().split(",");
                if (inputs.length == 4)
                    step = Step.FOUR;
                System.out.println("Step Three Details Provided");
                break;
            case FOUR:
                String input = request.getMessage();
                // iN iF WAS input.isBlank()
                if (!input.isBlank())
                    message = "Success";
                break;
        }

        return new Response(this.step, message);
    }
}
