package Practise;

public class Theatre {
    private Seat[][] theatreSeats;

    public Theatre(int seatsPerRow, int tier1Rows, int tier2Rows) {
        theatreSeats = new Seat[tier1Rows+tier2Rows][seatsPerRow];

        // for (int i=0; i< tier1Rows; i++) {
        //     for (int j=0; j<seatsPerRow; j++) {
        //         theatreSeats[i][j] = new Seat(true, 1);
        //     }
        // }

        // for (int i=tier1Rows; i<tier1Rows+tier2Rows; i++) {
        //     for(int j=0; j<seatsPerRow; j++) {
        //         theatreSeats[i][j] = new Seat (true, 2);
        //     }
        // }

        for (int i=0; i<tier1Rows+tier2Rows; i++) {
            for (int j=0; j<seatsPerRow; j++) {
                if (i<tier1Rows) theatreSeats[i][j] = new Seat(true, 1);
                else theatreSeats[i][j] = new Seat(true, 2);
            }
        }
    }

    public boolean reassignSeat(int fromRow, int fromCol, int toRow, int toCol) {
        // possible conditions: destination seat is available && sourceTier <= newTier
        // else: return false
        boolean desire = theatreSeats[fromRow][fromCol].getTier()<= theatreSeats[toRow][toCol].getTier();
        if (theatreSeats[toRow][toCol].isAvailable() && desire) {
            theatreSeats[toRow][toCol].setAvailability(false);
            theatreSeats[fromRow][fromCol].setAvailability(true);
            return true;
        }
        else {
            return false;
        }
    }
}
