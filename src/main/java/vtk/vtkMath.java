// java wrapper for vtkMath object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMath extends vtkObject
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native int DYNAMIC_VECTOR_SIZE_4();
  public int DYNAMIC_VECTOR_SIZE()
  {
    return DYNAMIC_VECTOR_SIZE_4();
  }

  private native double Pi_5();
  public double Pi()
  {
    return Pi_5();
  }

  private native float RadiansFromDegrees_6(float id0);
  public float RadiansFromDegrees(float id0)
  {
    return RadiansFromDegrees_6(id0);
  }

  private native double RadiansFromDegrees_7(double id0);
  public double RadiansFromDegrees(double id0)
  {
    return RadiansFromDegrees_7(id0);
  }

  private native float DegreesFromRadians_8(float id0);
  public float DegreesFromRadians(float id0)
  {
    return DegreesFromRadians_8(id0);
  }

  private native double DegreesFromRadians_9(double id0);
  public double DegreesFromRadians(double id0)
  {
    return DegreesFromRadians_9(id0);
  }

  private native int Round_10(float id0);
  public int Round(float id0)
  {
    return Round_10(id0);
  }

  private native int Round_11(double id0);
  public int Round(double id0)
  {
    return Round_11(id0);
  }

  private native int Floor_12(double id0);
  public int Floor(double id0)
  {
    return Floor_12(id0);
  }

  private native int Ceil_13(double id0);
  public int Ceil(double id0)
  {
    return Ceil_13(id0);
  }

  private native int CeilLog2_14(long id0);
  public int CeilLog2(long id0)
  {
    return CeilLog2_14(id0);
  }

  private native boolean IsPowerOfTwo_15(long id0);
  public boolean IsPowerOfTwo(long id0)
  {
    return IsPowerOfTwo_15(id0);
  }

  private native int NearestPowerOfTwo_16(int id0);
  public int NearestPowerOfTwo(int id0)
  {
    return NearestPowerOfTwo_16(id0);
  }

  private native long Factorial_17(int id0);
  public long Factorial(int id0)
  {
    return Factorial_17(id0);
  }

  private native long Binomial_18(int id0,int id1);
  public long Binomial(int id0,int id1)
  {
    return Binomial_18(id0,id1);
  }

  private native void RandomSeed_19(int id0);
  public void RandomSeed(int id0)
  {
    RandomSeed_19(id0);
  }

  private native int GetSeed_20();
  public int GetSeed()
  {
    return GetSeed_20();
  }

  private native double Random_21();
  public double Random()
  {
    return Random_21();
  }

  private native double Random_22(double id0,double id1);
  public double Random(double id0,double id1)
  {
    return Random_22(id0,id1);
  }

  private native double Gaussian_23();
  public double Gaussian()
  {
    return Gaussian_23();
  }

  private native double Gaussian_24(double id0,double id1);
  public double Gaussian(double id0,double id1)
  {
    return Gaussian_24(id0,id1);
  }

  private native void Assign_25(double id0[],double id1[]);
  public void Assign(double id0[],double id1[])
  {
    Assign_25(id0,id1);
  }

  private native void Add_26(float id0[],float id1[],float id2[]);
  public void Add(float id0[],float id1[],float id2[])
  {
    Add_26(id0,id1,id2);
  }

  private native void Add_27(double id0[],double id1[],double id2[]);
  public void Add(double id0[],double id1[],double id2[])
  {
    Add_27(id0,id1,id2);
  }

  private native void Subtract_28(float id0[],float id1[],float id2[]);
  public void Subtract(float id0[],float id1[],float id2[])
  {
    Subtract_28(id0,id1,id2);
  }

  private native void Subtract_29(double id0[],double id1[],double id2[]);
  public void Subtract(double id0[],double id1[],double id2[])
  {
    Subtract_29(id0,id1,id2);
  }

  private native void MultiplyScalar_30(float id0[],float id1);
  public void MultiplyScalar(float id0[],float id1)
  {
    MultiplyScalar_30(id0,id1);
  }

  private native void MultiplyScalar2D_31(float id0[],float id1);
  public void MultiplyScalar2D(float id0[],float id1)
  {
    MultiplyScalar2D_31(id0,id1);
  }

  private native void MultiplyScalar_32(double id0[],double id1);
  public void MultiplyScalar(double id0[],double id1)
  {
    MultiplyScalar_32(id0,id1);
  }

  private native void MultiplyScalar2D_33(double id0[],double id1);
  public void MultiplyScalar2D(double id0[],double id1)
  {
    MultiplyScalar2D_33(id0,id1);
  }

  private native float Dot_34(float id0[],float id1[]);
  public float Dot(float id0[],float id1[])
  {
    return Dot_34(id0,id1);
  }

  private native double Dot_35(double id0[],double id1[]);
  public double Dot(double id0[],double id1[])
  {
    return Dot_35(id0,id1);
  }

  private native void Cross_36(float id0[],float id1[],float id2[]);
  public void Cross(float id0[],float id1[],float id2[])
  {
    Cross_36(id0,id1,id2);
  }

  private native void Cross_37(double id0[],double id1[],double id2[]);
  public void Cross(double id0[],double id1[],double id2[])
  {
    Cross_37(id0,id1,id2);
  }

  private native float Norm_38(float id0[]);
  public float Norm(float id0[])
  {
    return Norm_38(id0);
  }

  private native double Norm_39(double id0[]);
  public double Norm(double id0[])
  {
    return Norm_39(id0);
  }

  private native float Normalize_40(float id0[]);
  public float Normalize(float id0[])
  {
    return Normalize_40(id0);
  }

  private native double Normalize_41(double id0[]);
  public double Normalize(double id0[])
  {
    return Normalize_41(id0);
  }

  private native void Perpendiculars_42(double id0[],double id1[],double id2[],double id3);
  public void Perpendiculars(double id0[],double id1[],double id2[],double id3)
  {
    Perpendiculars_42(id0,id1,id2,id3);
  }

  private native void Perpendiculars_43(float id0[],float id1[],float id2[],double id3);
  public void Perpendiculars(float id0[],float id1[],float id2[],double id3)
  {
    Perpendiculars_43(id0,id1,id2,id3);
  }

  private native boolean ProjectVector_44(float id0[],float id1[],float id2[]);
  public boolean ProjectVector(float id0[],float id1[],float id2[])
  {
    return ProjectVector_44(id0,id1,id2);
  }

  private native boolean ProjectVector_45(double id0[],double id1[],double id2[]);
  public boolean ProjectVector(double id0[],double id1[],double id2[])
  {
    return ProjectVector_45(id0,id1,id2);
  }

  private native boolean ProjectVector2D_46(float id0[],float id1[],float id2[]);
  public boolean ProjectVector2D(float id0[],float id1[],float id2[])
  {
    return ProjectVector2D_46(id0,id1,id2);
  }

  private native boolean ProjectVector2D_47(double id0[],double id1[],double id2[]);
  public boolean ProjectVector2D(double id0[],double id1[],double id2[])
  {
    return ProjectVector2D_47(id0,id1,id2);
  }

  private native float Distance2BetweenPoints_48(float id0[],float id1[]);
  public float Distance2BetweenPoints(float id0[],float id1[])
  {
    return Distance2BetweenPoints_48(id0,id1);
  }

  private native double Distance2BetweenPoints_49(double id0[],double id1[]);
  public double Distance2BetweenPoints(double id0[],double id1[])
  {
    return Distance2BetweenPoints_49(id0,id1);
  }

  private native double AngleBetweenVectors_50(double id0[],double id1[]);
  public double AngleBetweenVectors(double id0[],double id1[])
  {
    return AngleBetweenVectors_50(id0,id1);
  }

  private native double SignedAngleBetweenVectors_51(double id0[],double id1[],double id2[]);
  public double SignedAngleBetweenVectors(double id0[],double id1[],double id2[])
  {
    return SignedAngleBetweenVectors_51(id0,id1,id2);
  }

  private native double GaussianAmplitude_52(double id0,double id1);
  public double GaussianAmplitude(double id0,double id1)
  {
    return GaussianAmplitude_52(id0,id1);
  }

  private native double GaussianAmplitude_53(double id0,double id1,double id2);
  public double GaussianAmplitude(double id0,double id1,double id2)
  {
    return GaussianAmplitude_53(id0,id1,id2);
  }

  private native double GaussianWeight_54(double id0,double id1);
  public double GaussianWeight(double id0,double id1)
  {
    return GaussianWeight_54(id0,id1);
  }

  private native double GaussianWeight_55(double id0,double id1,double id2);
  public double GaussianWeight(double id0,double id1,double id2)
  {
    return GaussianWeight_55(id0,id1,id2);
  }

  private native float Dot2D_56(float id0[],float id1[]);
  public float Dot2D(float id0[],float id1[])
  {
    return Dot2D_56(id0,id1);
  }

  private native double Dot2D_57(double id0[],double id1[]);
  public double Dot2D(double id0[],double id1[])
  {
    return Dot2D_57(id0,id1);
  }

  private native float Norm2D_58(float id0[]);
  public float Norm2D(float id0[])
  {
    return Norm2D_58(id0);
  }

  private native double Norm2D_59(double id0[]);
  public double Norm2D(double id0[])
  {
    return Norm2D_59(id0);
  }

  private native float Normalize2D_60(float id0[]);
  public float Normalize2D(float id0[])
  {
    return Normalize2D_60(id0);
  }

  private native double Normalize2D_61(double id0[]);
  public double Normalize2D(double id0[])
  {
    return Normalize2D_61(id0);
  }

  private native float Determinant2x2_62(float id0[],float id1[]);
  public float Determinant2x2(float id0[],float id1[])
  {
    return Determinant2x2_62(id0,id1);
  }

  private native double Determinant2x2_63(double id0,double id1,double id2,double id3);
  public double Determinant2x2(double id0,double id1,double id2,double id3)
  {
    return Determinant2x2_63(id0,id1,id2,id3);
  }

  private native double Determinant2x2_64(double id0[],double id1[]);
  public double Determinant2x2(double id0[],double id1[])
  {
    return Determinant2x2_64(id0,id1);
  }

  private native float Determinant3x3_65(float id0[],float id1[],float id2[]);
  public float Determinant3x3(float id0[],float id1[],float id2[])
  {
    return Determinant3x3_65(id0,id1,id2);
  }

  private native double Determinant3x3_66(double id0[],double id1[],double id2[]);
  public double Determinant3x3(double id0[],double id1[],double id2[])
  {
    return Determinant3x3_66(id0,id1,id2);
  }

  private native double Determinant3x3_67(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8);
  public double Determinant3x3(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8)
  {
    return Determinant3x3_67(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native void MultiplyQuaternion_68(float id0[],float id1[],float id2[]);
  public void MultiplyQuaternion(float id0[],float id1[],float id2[])
  {
    MultiplyQuaternion_68(id0,id1,id2);
  }

  private native void MultiplyQuaternion_69(double id0[],double id1[],double id2[]);
  public void MultiplyQuaternion(double id0[],double id1[],double id2[])
  {
    MultiplyQuaternion_69(id0,id1,id2);
  }

  private native void RotateVectorByNormalizedQuaternion_70(float id0[],float id1[],float id2[]);
  public void RotateVectorByNormalizedQuaternion(float id0[],float id1[],float id2[])
  {
    RotateVectorByNormalizedQuaternion_70(id0,id1,id2);
  }

  private native void RotateVectorByNormalizedQuaternion_71(double id0[],double id1[],double id2[]);
  public void RotateVectorByNormalizedQuaternion(double id0[],double id1[],double id2[])
  {
    RotateVectorByNormalizedQuaternion_71(id0,id1,id2);
  }

  private native void RotateVectorByWXYZ_72(float id0[],float id1[],float id2[]);
  public void RotateVectorByWXYZ(float id0[],float id1[],float id2[])
  {
    RotateVectorByWXYZ_72(id0,id1,id2);
  }

  private native void RotateVectorByWXYZ_73(double id0[],double id1[],double id2[]);
  public void RotateVectorByWXYZ(double id0[],double id1[],double id2[])
  {
    RotateVectorByWXYZ_73(id0,id1,id2);
  }

  private native void RGBToHSV_74(float id0[],float id1[]);
  public void RGBToHSV(float id0[],float id1[])
  {
    RGBToHSV_74(id0,id1);
  }

  private native void RGBToHSV_75(double id0[],double id1[]);
  public void RGBToHSV(double id0[],double id1[])
  {
    RGBToHSV_75(id0,id1);
  }

  private native void HSVToRGB_76(float id0[],float id1[]);
  public void HSVToRGB(float id0[],float id1[])
  {
    HSVToRGB_76(id0,id1);
  }

  private native void HSVToRGB_77(double id0[],double id1[]);
  public void HSVToRGB(double id0[],double id1[])
  {
    HSVToRGB_77(id0,id1);
  }

  private native void LabToXYZ_78(double id0[],double id1[]);
  public void LabToXYZ(double id0[],double id1[])
  {
    LabToXYZ_78(id0,id1);
  }

  private native void XYZToLab_79(double id0[],double id1[]);
  public void XYZToLab(double id0[],double id1[])
  {
    XYZToLab_79(id0,id1);
  }

  private native void XYZToRGB_80(double id0[],double id1[]);
  public void XYZToRGB(double id0[],double id1[])
  {
    XYZToRGB_80(id0,id1);
  }

  private native void RGBToXYZ_81(double id0[],double id1[]);
  public void RGBToXYZ(double id0[],double id1[])
  {
    RGBToXYZ_81(id0,id1);
  }

  private native void RGBToLab_82(double id0[],double id1[]);
  public void RGBToLab(double id0[],double id1[])
  {
    RGBToLab_82(id0,id1);
  }

  private native void LabToRGB_83(double id0[],double id1[]);
  public void LabToRGB(double id0[],double id1[])
  {
    LabToRGB_83(id0,id1);
  }

  private native void UninitializeBounds_84(double id0[]);
  public void UninitializeBounds(double id0[])
  {
    UninitializeBounds_84(id0);
  }

  private native int AreBoundsInitialized_85(double id0[]);
  public int AreBoundsInitialized(double id0[])
  {
    return AreBoundsInitialized_85(id0);
  }

  private native double ClampAndNormalizeValue_86(double id0,double id1[]);
  public double ClampAndNormalizeValue(double id0,double id1[])
  {
    return ClampAndNormalizeValue_86(id0,id1);
  }

  private native int GetScalarTypeFittingRange_87(double id0,double id1,double id2,double id3);
  public int GetScalarTypeFittingRange(double id0,double id1,double id2,double id3)
  {
    return GetScalarTypeFittingRange_87(id0,id1,id2,id3);
  }

  private native int GetAdjustedScalarRange_88(vtkDataArray id0,int id1,double id2[]);
  public int GetAdjustedScalarRange(vtkDataArray id0,int id1,double id2[])
  {
    return GetAdjustedScalarRange_88(id0,id1,id2);
  }

  private native int ExtentIsWithinOtherExtent_89(int id0[],int id1[]);
  public int ExtentIsWithinOtherExtent(int id0[],int id1[])
  {
    return ExtentIsWithinOtherExtent_89(id0,id1);
  }

  private native int BoundsIsWithinOtherBounds_90(double id0[],double id1[],double id2[]);
  public int BoundsIsWithinOtherBounds(double id0[],double id1[],double id2[])
  {
    return BoundsIsWithinOtherBounds_90(id0,id1,id2);
  }

  private native int PointIsWithinBounds_91(double id0[],double id1[],double id2[]);
  public int PointIsWithinBounds(double id0[],double id1[],double id2[])
  {
    return PointIsWithinBounds_91(id0,id1,id2);
  }

  private native int PlaneIntersectsAABB_92(double id0[],double id1[],double id2[]);
  public int PlaneIntersectsAABB(double id0[],double id1[],double id2[])
  {
    return PlaneIntersectsAABB_92(id0,id1,id2);
  }

  private native double Solve3PointCircle_93(double id0[],double id1[],double id2[],double id3[]);
  public double Solve3PointCircle(double id0[],double id1[],double id2[],double id3[])
  {
    return Solve3PointCircle_93(id0,id1,id2,id3);
  }

  private native double Inf_94();
  public double Inf()
  {
    return Inf_94();
  }

  private native double NegInf_95();
  public double NegInf()
  {
    return NegInf_95();
  }

  private native double Nan_96();
  public double Nan()
  {
    return Nan_96();
  }

  private native int IsInf_97(double id0);
  public int IsInf(double id0)
  {
    return IsInf_97(id0);
  }

  private native int IsNan_98(double id0);
  public int IsNan(double id0)
  {
    return IsNan_98(id0);
  }

  private native boolean IsFinite_99(double id0);
  public boolean IsFinite(double id0)
  {
    return IsFinite_99(id0);
  }

  private native long ComputeGCD_100(long id0,long id1);
  public long ComputeGCD(long id0,long id1)
  {
    return ComputeGCD_100(id0,id1);
  }

  private native void GetPointAlongLine_101(double id0[],double id1[],double id2[],double id3);
  public void GetPointAlongLine(double id0[],double id1[],double id2[],double id3)
  {
    GetPointAlongLine_101(id0,id1,id2,id3);
  }

  public vtkMath() { super(); }

  public vtkMath(long id) { super(id); }
  public native long   VTKInit();

}
