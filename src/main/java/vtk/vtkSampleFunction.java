// java wrapper for vtkSampleFunction object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSampleFunction extends vtkImageAlgorithm
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

  private native void SetImplicitFunction_4(vtkImplicitFunction id0);
  public void SetImplicitFunction(vtkImplicitFunction id0)
  {
    SetImplicitFunction_4(id0);
  }

  private native long GetImplicitFunction_5();
  public vtkImplicitFunction GetImplicitFunction()
  {
    long temp = GetImplicitFunction_5();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutputScalarType_6(int id0);
  public void SetOutputScalarType(int id0)
  {
    SetOutputScalarType_6(id0);
  }

  private native int GetOutputScalarType_7();
  public int GetOutputScalarType()
  {
    return GetOutputScalarType_7();
  }

  private native void SetOutputScalarTypeToDouble_8();
  public void SetOutputScalarTypeToDouble()
  {
    SetOutputScalarTypeToDouble_8();
  }

  private native void SetOutputScalarTypeToFloat_9();
  public void SetOutputScalarTypeToFloat()
  {
    SetOutputScalarTypeToFloat_9();
  }

  private native void SetOutputScalarTypeToLong_10();
  public void SetOutputScalarTypeToLong()
  {
    SetOutputScalarTypeToLong_10();
  }

  private native void SetOutputScalarTypeToUnsignedLong_11();
  public void SetOutputScalarTypeToUnsignedLong()
  {
    SetOutputScalarTypeToUnsignedLong_11();
  }

  private native void SetOutputScalarTypeToInt_12();
  public void SetOutputScalarTypeToInt()
  {
    SetOutputScalarTypeToInt_12();
  }

  private native void SetOutputScalarTypeToUnsignedInt_13();
  public void SetOutputScalarTypeToUnsignedInt()
  {
    SetOutputScalarTypeToUnsignedInt_13();
  }

  private native void SetOutputScalarTypeToShort_14();
  public void SetOutputScalarTypeToShort()
  {
    SetOutputScalarTypeToShort_14();
  }

  private native void SetOutputScalarTypeToUnsignedShort_15();
  public void SetOutputScalarTypeToUnsignedShort()
  {
    SetOutputScalarTypeToUnsignedShort_15();
  }

  private native void SetOutputScalarTypeToChar_16();
  public void SetOutputScalarTypeToChar()
  {
    SetOutputScalarTypeToChar_16();
  }

  private native void SetOutputScalarTypeToUnsignedChar_17();
  public void SetOutputScalarTypeToUnsignedChar()
  {
    SetOutputScalarTypeToUnsignedChar_17();
  }

  private native void SetSampleDimensions_18(int id0,int id1,int id2);
  public void SetSampleDimensions(int id0,int id1,int id2)
  {
    SetSampleDimensions_18(id0,id1,id2);
  }

  private native void SetSampleDimensions_19(int id0[]);
  public void SetSampleDimensions(int id0[])
  {
    SetSampleDimensions_19(id0);
  }

  private native int[] GetSampleDimensions_20();
  public int[] GetSampleDimensions()
  {
    return GetSampleDimensions_20();
  }

  private native void SetModelBounds_21(double id0[]);
  public void SetModelBounds(double id0[])
  {
    SetModelBounds_21(id0);
  }

  private native void SetModelBounds_22(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetModelBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetModelBounds_22(id0,id1,id2,id3,id4,id5);
  }

  private native double[] GetModelBounds_23();
  public double[] GetModelBounds()
  {
    return GetModelBounds_23();
  }

  private native void SetCapping_24(int id0);
  public void SetCapping(int id0)
  {
    SetCapping_24(id0);
  }

  private native int GetCapping_25();
  public int GetCapping()
  {
    return GetCapping_25();
  }

  private native void CappingOn_26();
  public void CappingOn()
  {
    CappingOn_26();
  }

  private native void CappingOff_27();
  public void CappingOff()
  {
    CappingOff_27();
  }

  private native void SetCapValue_28(double id0);
  public void SetCapValue(double id0)
  {
    SetCapValue_28(id0);
  }

  private native double GetCapValue_29();
  public double GetCapValue()
  {
    return GetCapValue_29();
  }

  private native void SetComputeNormals_30(int id0);
  public void SetComputeNormals(int id0)
  {
    SetComputeNormals_30(id0);
  }

  private native int GetComputeNormals_31();
  public int GetComputeNormals()
  {
    return GetComputeNormals_31();
  }

  private native void ComputeNormalsOn_32();
  public void ComputeNormalsOn()
  {
    ComputeNormalsOn_32();
  }

  private native void ComputeNormalsOff_33();
  public void ComputeNormalsOff()
  {
    ComputeNormalsOff_33();
  }

  private native void SetScalarArrayName_34(byte[] id0, int len0);
  public void SetScalarArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScalarArrayName_34(bytes0, bytes0.length);
  }

  private native byte[] GetScalarArrayName_35();
  public String GetScalarArrayName()
  {
    return new String(GetScalarArrayName_35(), StandardCharsets.UTF_8);
  }

  private native void SetNormalArrayName_36(byte[] id0, int len0);
  public void SetNormalArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNormalArrayName_36(bytes0, bytes0.length);
  }

  private native byte[] GetNormalArrayName_37();
  public String GetNormalArrayName()
  {
    return new String(GetNormalArrayName_37(), StandardCharsets.UTF_8);
  }

  private native long GetMTime_38();
  public long GetMTime()
  {
    return GetMTime_38();
  }

  public vtkSampleFunction() { super(); }

  public vtkSampleFunction(long id) { super(id); }
  public native long   VTKInit();

}
