package by.koroza.programming_with_classes.composition.numberfive.entity;

public class TravelCampany {
	private String name;
	private TravelVoucher[] travelVouchers;
	private static final String COMPANY_DOES_NOT_HAVE_TOURIST_VOUCHERS = "At the moment, the company does not have tourist vouchers";
	private static final String NEXT_LINE = "\n";
	private static final String NAME = "Name: ";

	public TravelCampany(String name) {
		this.name = name;
		this.travelVouchers = new TravelVoucher[0];
	}

	public TravelCampany(String name, TravelVoucher travelVocher) {
		this.name = name;
		this.travelVouchers = new TravelVoucher[1];
		this.travelVouchers[0] = travelVocher;
	}

	public TravelCampany(String name, TravelVoucher[] travelVochers) {
		this.name = name;
		this.travelVouchers = travelVochers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TravelVoucher[] getTravelVouchers() {
		return travelVouchers;
	}

	public void setTravelVouchers(TravelVoucher[] travelVouchers) {
		this.travelVouchers = travelVouchers;
	}

	public void addTravelVoucher(TravelVoucher travelVoucher) {
		TravelVoucher[] travelVouchersNew = new TravelVoucher[this.travelVouchers.length + 1];
		for (int i = 0; i < travelVouchersNew.length; i++) {
			if (i < this.travelVouchers.length) {
				travelVouchersNew[i] = this.travelVouchers[i];
			} else if (i == this.travelVouchers.length) {
				travelVouchersNew[i] = travelVoucher;
			}
		}
		this.travelVouchers = travelVouchersNew;
	}

	public void addTravelVouchers(TravelVoucher[] travelVochers) {
		TravelVoucher[] travelVouchersNew = new TravelVoucher[this.travelVouchers.length + travelVouchers.length];
		for (int i = 0; i < travelVouchersNew.length; i++) {
			if (i < this.travelVouchers.length) {
				travelVouchersNew[i] = this.travelVouchers[i];
			} else if (i >= this.travelVouchers.length) {
				travelVouchersNew[i] = travelVouchers[i - this.travelVouchers.length];
			}
		}
		this.travelVouchers = travelVouchersNew;
	}

	public void changeStatusTravelVoucherByID(int id) {
		for (TravelVoucher voucher : travelVouchers) {
			if (voucher.getID() == id) {
				voucher.setIsStatusAdd(false);
			}
		}
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + (travelVouchers != null ? travelVouchers.hashCode() : 1);
		result = result * prime
				+ (COMPANY_DOES_NOT_HAVE_TOURIST_VOUCHERS != null ? COMPANY_DOES_NOT_HAVE_TOURIST_VOUCHERS.hashCode()
						: 1);
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
		result = result * prime + (NAME != null ? NAME.hashCode() : 1);
		return result;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (!getClass().equals(object.getClass())) {
			return false;
		}
		TravelCampany campany = (TravelCampany) object;
		if (name == null) {
			if (campany.name != null) {
				return false;
			}
		} else if (!name.equals(campany.name)) {
			return false;
		}
		if (travelVouchers == null) {
			if (campany.travelVouchers != null) {
				return false;
			}
		} else if (!travelVouchers.equals(campany.travelVouchers)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(NAME).append(name).append(NEXT_LINE);
		for (int i = 0; i < travelVouchers.length; i++) {
			if (travelVouchers[i] != null) {
				builder.append(travelVouchers[i].toString());
			}
			if (i < travelVouchers.length - 1) {
				builder.append(NEXT_LINE);
			}
		}
		if (travelVouchers.length == 0) {
			builder.append(COMPANY_DOES_NOT_HAVE_TOURIST_VOUCHERS);
		}
		return builder.toString();
	}
}