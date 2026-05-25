// java wrapper for vtkImageCast object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageCast extends vtkThreadedImageAlgorithm
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

  private native void SetOutputScalarType_4(int id0);
  public void SetOutputScalarType(int id0)
  {
    SetOutputScalarType_4(id0);
  }

  private native int GetOutputScalarType_5();
  public int GetOutputScalarType()
  {
    return GetOutputScalarType_5();
  }

  private native void SetOutputScalarTypeToFloat_6();
  public void SetOutputScalarTypeToFloat()
  {
    SetOutputScalarTypeToFloat_6();
  }

  private native void SetOutputScalarTypeToDouble_7();
  public void SetOutputScalarTypeToDouble()
  {
    SetOutputScalarTypeToDouble_7();
  }

  private native void SetOutputScalarTypeToInt_8();
  public void SetOutputScalarTypeToInt()
  {
    SetOutputScalarTypeToInt_8();
  }

  private native void SetOutputScalarTypeToUnsignedInt_9();
  public void SetOutputScalarTypeToUnsignedInt()
  {
    SetOutputScalarTypeToUnsignedInt_9();
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

  private native void SetOutputScalarTypeToShort_12();
  public void SetOutputScalarTypeToShort()
  {
    SetOutputScalarTypeToShort_12();
  }

  private native void SetOutputScalarTypeToUnsignedShort_13();
  public void SetOutputScalarTypeToUnsignedShort()
  {
    SetOutputScalarTypeToUnsignedShort_13();
  }

  private native void SetOutputScalarTypeToUnsignedChar_14();
  public void SetOutputScalarTypeToUnsignedChar()
  {
    SetOutputScalarTypeToUnsignedChar_14();
  }

  private native void SetOutputScalarTypeToChar_15();
  public void SetOutputScalarTypeToChar()
  {
    SetOutputScalarTypeToChar_15();
  }

  private native void SetClampOverflow_16(int id0);
  public void SetClampOverflow(int id0)
  {
    SetClampOverflow_16(id0);
  }

  private native int GetClampOverflow_17();
  public int GetClampOverflow()
  {
    return GetClampOverflow_17();
  }

  private native void ClampOverflowOn_18();
  public void ClampOverflowOn()
  {
    ClampOverflowOn_18();
  }

  private native void ClampOverflowOff_19();
  public void ClampOverflowOff()
  {
    ClampOverflowOff_19();
  }

  public vtkImageCast() { super(); }

  public vtkImageCast(long id) { super(id); }
  public native long   VTKInit();

}
