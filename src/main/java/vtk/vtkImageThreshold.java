// java wrapper for vtkImageThreshold object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageThreshold extends vtkThreadedImageAlgorithm
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

  private native void ThresholdByUpper_4(double id0);
  public void ThresholdByUpper(double id0)
  {
    ThresholdByUpper_4(id0);
  }

  private native void ThresholdByLower_5(double id0);
  public void ThresholdByLower(double id0)
  {
    ThresholdByLower_5(id0);
  }

  private native void ThresholdBetween_6(double id0,double id1);
  public void ThresholdBetween(double id0,double id1)
  {
    ThresholdBetween_6(id0,id1);
  }

  private native void SetReplaceIn_7(int id0);
  public void SetReplaceIn(int id0)
  {
    SetReplaceIn_7(id0);
  }

  private native int GetReplaceIn_8();
  public int GetReplaceIn()
  {
    return GetReplaceIn_8();
  }

  private native void ReplaceInOn_9();
  public void ReplaceInOn()
  {
    ReplaceInOn_9();
  }

  private native void ReplaceInOff_10();
  public void ReplaceInOff()
  {
    ReplaceInOff_10();
  }

  private native void SetInValue_11(double id0);
  public void SetInValue(double id0)
  {
    SetInValue_11(id0);
  }

  private native double GetInValue_12();
  public double GetInValue()
  {
    return GetInValue_12();
  }

  private native void SetReplaceOut_13(int id0);
  public void SetReplaceOut(int id0)
  {
    SetReplaceOut_13(id0);
  }

  private native int GetReplaceOut_14();
  public int GetReplaceOut()
  {
    return GetReplaceOut_14();
  }

  private native void ReplaceOutOn_15();
  public void ReplaceOutOn()
  {
    ReplaceOutOn_15();
  }

  private native void ReplaceOutOff_16();
  public void ReplaceOutOff()
  {
    ReplaceOutOff_16();
  }

  private native void SetOutValue_17(double id0);
  public void SetOutValue(double id0)
  {
    SetOutValue_17(id0);
  }

  private native double GetOutValue_18();
  public double GetOutValue()
  {
    return GetOutValue_18();
  }

  private native double GetUpperThreshold_19();
  public double GetUpperThreshold()
  {
    return GetUpperThreshold_19();
  }

  private native double GetLowerThreshold_20();
  public double GetLowerThreshold()
  {
    return GetLowerThreshold_20();
  }

  private native void SetOutputScalarType_21(int id0);
  public void SetOutputScalarType(int id0)
  {
    SetOutputScalarType_21(id0);
  }

  private native int GetOutputScalarType_22();
  public int GetOutputScalarType()
  {
    return GetOutputScalarType_22();
  }

  private native void SetOutputScalarTypeToDouble_23();
  public void SetOutputScalarTypeToDouble()
  {
    SetOutputScalarTypeToDouble_23();
  }

  private native void SetOutputScalarTypeToFloat_24();
  public void SetOutputScalarTypeToFloat()
  {
    SetOutputScalarTypeToFloat_24();
  }

  private native void SetOutputScalarTypeToLong_25();
  public void SetOutputScalarTypeToLong()
  {
    SetOutputScalarTypeToLong_25();
  }

  private native void SetOutputScalarTypeToUnsignedLong_26();
  public void SetOutputScalarTypeToUnsignedLong()
  {
    SetOutputScalarTypeToUnsignedLong_26();
  }

  private native void SetOutputScalarTypeToInt_27();
  public void SetOutputScalarTypeToInt()
  {
    SetOutputScalarTypeToInt_27();
  }

  private native void SetOutputScalarTypeToUnsignedInt_28();
  public void SetOutputScalarTypeToUnsignedInt()
  {
    SetOutputScalarTypeToUnsignedInt_28();
  }

  private native void SetOutputScalarTypeToShort_29();
  public void SetOutputScalarTypeToShort()
  {
    SetOutputScalarTypeToShort_29();
  }

  private native void SetOutputScalarTypeToUnsignedShort_30();
  public void SetOutputScalarTypeToUnsignedShort()
  {
    SetOutputScalarTypeToUnsignedShort_30();
  }

  private native void SetOutputScalarTypeToChar_31();
  public void SetOutputScalarTypeToChar()
  {
    SetOutputScalarTypeToChar_31();
  }

  private native void SetOutputScalarTypeToSignedChar_32();
  public void SetOutputScalarTypeToSignedChar()
  {
    SetOutputScalarTypeToSignedChar_32();
  }

  private native void SetOutputScalarTypeToUnsignedChar_33();
  public void SetOutputScalarTypeToUnsignedChar()
  {
    SetOutputScalarTypeToUnsignedChar_33();
  }

  public vtkImageThreshold() { super(); }

  public vtkImageThreshold(long id) { super(id); }
  public native long   VTKInit();

}
