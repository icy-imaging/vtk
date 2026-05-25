// java wrapper for vtkVoxelModeller object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVoxelModeller extends vtkImageAlgorithm
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

  private native double ComputeModelBounds_4(double id0[],double id1[]);
  public double ComputeModelBounds(double id0[],double id1[])
  {
    return ComputeModelBounds_4(id0,id1);
  }

  private native void SetSampleDimensions_5(int id0,int id1,int id2);
  public void SetSampleDimensions(int id0,int id1,int id2)
  {
    SetSampleDimensions_5(id0,id1,id2);
  }

  private native void SetSampleDimensions_6(int id0[]);
  public void SetSampleDimensions(int id0[])
  {
    SetSampleDimensions_6(id0);
  }

  private native int[] GetSampleDimensions_7();
  public int[] GetSampleDimensions()
  {
    return GetSampleDimensions_7();
  }

  private native void SetMaximumDistance_8(double id0);
  public void SetMaximumDistance(double id0)
  {
    SetMaximumDistance_8(id0);
  }

  private native double GetMaximumDistanceMinValue_9();
  public double GetMaximumDistanceMinValue()
  {
    return GetMaximumDistanceMinValue_9();
  }

  private native double GetMaximumDistanceMaxValue_10();
  public double GetMaximumDistanceMaxValue()
  {
    return GetMaximumDistanceMaxValue_10();
  }

  private native double GetMaximumDistance_11();
  public double GetMaximumDistance()
  {
    return GetMaximumDistance_11();
  }

  private native void SetModelBounds_12(double id0[]);
  public void SetModelBounds(double id0[])
  {
    SetModelBounds_12(id0);
  }

  private native void SetModelBounds_13(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetModelBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetModelBounds_13(id0,id1,id2,id3,id4,id5);
  }

  private native double[] GetModelBounds_14();
  public double[] GetModelBounds()
  {
    return GetModelBounds_14();
  }

  private native void SetScalarType_15(int id0);
  public void SetScalarType(int id0)
  {
    SetScalarType_15(id0);
  }

  private native void SetScalarTypeToFloat_16();
  public void SetScalarTypeToFloat()
  {
    SetScalarTypeToFloat_16();
  }

  private native void SetScalarTypeToDouble_17();
  public void SetScalarTypeToDouble()
  {
    SetScalarTypeToDouble_17();
  }

  private native void SetScalarTypeToInt_18();
  public void SetScalarTypeToInt()
  {
    SetScalarTypeToInt_18();
  }

  private native void SetScalarTypeToUnsignedInt_19();
  public void SetScalarTypeToUnsignedInt()
  {
    SetScalarTypeToUnsignedInt_19();
  }

  private native void SetScalarTypeToLong_20();
  public void SetScalarTypeToLong()
  {
    SetScalarTypeToLong_20();
  }

  private native void SetScalarTypeToUnsignedLong_21();
  public void SetScalarTypeToUnsignedLong()
  {
    SetScalarTypeToUnsignedLong_21();
  }

  private native void SetScalarTypeToShort_22();
  public void SetScalarTypeToShort()
  {
    SetScalarTypeToShort_22();
  }

  private native void SetScalarTypeToUnsignedShort_23();
  public void SetScalarTypeToUnsignedShort()
  {
    SetScalarTypeToUnsignedShort_23();
  }

  private native void SetScalarTypeToUnsignedChar_24();
  public void SetScalarTypeToUnsignedChar()
  {
    SetScalarTypeToUnsignedChar_24();
  }

  private native void SetScalarTypeToChar_25();
  public void SetScalarTypeToChar()
  {
    SetScalarTypeToChar_25();
  }

  private native void SetScalarTypeToBit_26();
  public void SetScalarTypeToBit()
  {
    SetScalarTypeToBit_26();
  }

  private native int GetScalarType_27();
  public int GetScalarType()
  {
    return GetScalarType_27();
  }

  private native void SetForegroundValue_28(double id0);
  public void SetForegroundValue(double id0)
  {
    SetForegroundValue_28(id0);
  }

  private native double GetForegroundValue_29();
  public double GetForegroundValue()
  {
    return GetForegroundValue_29();
  }

  private native void SetBackgroundValue_30(double id0);
  public void SetBackgroundValue(double id0)
  {
    SetBackgroundValue_30(id0);
  }

  private native double GetBackgroundValue_31();
  public double GetBackgroundValue()
  {
    return GetBackgroundValue_31();
  }

  public vtkVoxelModeller() { super(); }

  public vtkVoxelModeller(long id) { super(id); }
  public native long   VTKInit();

}
