
import java.awt.*;
import java.io.IOException;
import java.util.Stack;

public class DisplayGraph extends Display {
    Stack stack1T;
    Stack stack2T;
    Stack stack3T;

    public DisplayGraph(Stack stack1T, Stack stack2T, Stack stack3T) {
        super();
        this.stack1T=stack1T;
        this.stack2T=stack2T;
        this.stack3T=stack3T;

    }

    void Display(){


        // configuring everything by default
        com.github.plot.Plot plot = com.github.plot.Plot.plot(null).
                // setting data
                        series("a", com.github.plot.Plot.data().
                        xy(1, (Integer)stack1T.pop()).
                        xy(2, (Integer)stack1T.pop()).
                        xy(3, (Integer)stack1T.pop()).
                        xy(4, (Integer)stack1T.pop()).
                        xy(5, (Integer)stack1T.pop()),
                        com.github.plot.Plot.seriesOpts().
                                marker(com.github.plot.Plot.Marker.DIAMOND).
                                markerColor(Color.GREEN).
                                color(Color.BLACK)).

        series("b", com.github.plot.Plot.data().
                        xy(1, (Integer)stack2T.pop()).
                        xy(2, (Integer)stack2T.pop()).
                        xy(3, (Integer)stack2T.pop()).
                        xy(4, (Integer)stack2T.pop()).
                        xy(5, (Integer)stack2T.pop()),
                com.github.plot.Plot.seriesOpts().
                        marker(com.github.plot.Plot.Marker.DIAMOND).
                        markerColor(Color.RED).
                        color(Color.BLACK)).

        series("c", com.github.plot.Plot.data().
                        xy(1, (Double)stack3T.pop()).
                        xy(2, (Double)stack3T.pop()).
                        xy(3, (Double)stack3T.pop()).
                        xy(4, (Double)stack3T.pop()).
                        xy(5, (Double)stack3T.pop()),
                com.github.plot.Plot.seriesOpts().
                        marker(com.github.plot.Plot.Marker.DIAMOND).
                        markerColor(Color.BLUE).
                        color(Color.BLACK));



        try {
            plot.save("sample_hello", "png");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
