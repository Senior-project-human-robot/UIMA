package developerAnnotators;

import dataStructures.Annotator;

import java.io.IOException;

public class DeveloperMemoryLoadAnnotator extends Annotator {

    private final String unitWrapper = "\"edu.rosehulman.aixprize.pipeline.types.MemoryLoad\":";

    @Override
    public String process(String request) throws IOException {
        String result = "[{\"namedBlocks\":[{\"id\":4,\"name\":\"Bob\",\"x\":-0.01628926582634449,\"y\":-0.04363936185836792,\"z\":1.2850000858306885},{\"id\":3,\"name\":\"Mitchell\",\"x\":-0.4298781454563141,\"y\":-0.15041720867156982,\"z\":1.0380001068115234},{\"id\":1,\"name\":\"Joseph\",\"x\":-0.06132210046052933,\"y\":-0.1967618763446808,\"z\":1.0390000343322754},{\"id\":1,\"name\":\"Joseph\",\"x\":-0.065570168197155,\"y\":-0.1925860196352005,\"z\":1.0170000791549683},{\"id\":1,\"name\":\"Joseph\",\"x\":-0.08332977443933487,\"y\":-0.19800086319446564,\"z\":1.031000018119812}]}]";
        return "{"+unitWrapper+result+"}";
    }
}
