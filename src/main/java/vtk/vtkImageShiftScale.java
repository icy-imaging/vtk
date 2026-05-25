// java wrapper for vtkImageShiftScale object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageShiftScale extends vtkThreadedImageAlgorithm
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

  private native void SetShift_4(double id0);
  public void SetShift(double id0)
  {
    SetShift_4(id0);
  }

  private native double GetShift_5();
  public double GetShift()
  {
    return GetShift_5();
  }

  private native void SetScale_6(double id0);
  public void SetScale(double id0)
  {
    SetScale_6(id0);
  }

  private native double GetScale_7();
  public double GetScale()
  {
    return GetScale_7();
  }

  private native void SetOutputScalarType_8(int id0);
  public void SetOutputScalarType(int id0)
  {
    SetOutputScalarType_8(id0);
  }

  private native int GetOutputScalarType_9();
  public int GetOutputScalarType()
  {
    return GetOutputScalarType_9();
  }

  private native void SetOutputScalarTypeToDouble_10();
  public void SetOutputScalarTypeToDouble()
  {
    SetOutputScalarTypeToDouble_10();
  }

  private native void SetOutputScalarTypeToFloat_11();
  public void SetOutputScalarTypeToFloat()
  {
    SetOutputScalarTypeToFloat_11();
  }

  private native void SetOutputScalarTypeToLong_12();
  public void SetOutputScalarTypeToLong()
  {
    SetOutputScalarTypeToLong_12();
  }

  private native void SetOutputScalarTypeToUnsignedLong_13();
  public void SetOutputScalarTypeToUnsignedLong()
  {
    SetOutputScalarTypeToUnsignedLong_13();
  }

  private native void SetOutputScalarTypeToInt_14();
  public void SetOutputScalarTypeToInt()
  {
    SetOutputScalarTypeToInt_14();
  }

  private native void SetOutputScalarTypeToUnsignedInt_15();
  public void SetOutputScalarTypeToUnsignedInt()
  {
    SetOutputScalarTypeToUnsignedInt_15();
  }

  private native void SetOutputScalarTypeToShort_16();
  public void SetOutputScalarTypeToShort()
  {
    SetOutputScalarTypeToShort_16();
  }

  private native void SetOutputScalarTypeToUnsignedShort_17();
  public void SetOutputScalarTypeToUnsignedShort()
  {
    SetOutputScalarTypeToUnsignedShort_17();
  }

  private native void SetOutputScalarTypeToChar_18();
  public void SetOutputScalarTypeToChar()
  {
    SetOutputScalarTypeToChar_18();
  }

  private native void SetOutputScalarTypeToUnsignedChar_19();
  public void SetOutputScalarTypeToUnsignedChar()
  {
    SetOutputScalarTypeToUnsignedChar_19();
  }

  private native void SetClampOverflow_20(int id0);
  public void SetClampOverflow(int id0)
  {
    SetClampOverflow_20(id0);
  }

  private native int GetClampOverflow_21();
  public int GetClampOverflow()
  {
    return GetClampOverflow_21();
  }

  private native void ClampOverflowOn_22();
  public void ClampOverflowOn()
  {
    ClampOverflowOn_22();
  }

  private native void ClampOverflowOff_23();
  public void ClampOverflowOff()
  {
    ClampOverflowOff_23();
  }

  public vtkImageShiftScale() { super(); }

  public vtkImageShiftScale(long id) { super(id); }
  public native long   VTKInit();

}
