// java wrapper for vtkImageStencilToImage object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageStencilToImage extends vtkImageAlgorithm
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

  private native void SetOutsideValue_4(double id0);
  public void SetOutsideValue(double id0)
  {
    SetOutsideValue_4(id0);
  }

  private native double GetOutsideValue_5();
  public double GetOutsideValue()
  {
    return GetOutsideValue_5();
  }

  private native void SetInsideValue_6(double id0);
  public void SetInsideValue(double id0)
  {
    SetInsideValue_6(id0);
  }

  private native double GetInsideValue_7();
  public double GetInsideValue()
  {
    return GetInsideValue_7();
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

  private native void SetOutputScalarTypeToFloat_10();
  public void SetOutputScalarTypeToFloat()
  {
    SetOutputScalarTypeToFloat_10();
  }

  private native void SetOutputScalarTypeToDouble_11();
  public void SetOutputScalarTypeToDouble()
  {
    SetOutputScalarTypeToDouble_11();
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

  private native void SetOutputScalarTypeToLong_14();
  public void SetOutputScalarTypeToLong()
  {
    SetOutputScalarTypeToLong_14();
  }

  private native void SetOutputScalarTypeToUnsignedLong_15();
  public void SetOutputScalarTypeToUnsignedLong()
  {
    SetOutputScalarTypeToUnsignedLong_15();
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

  private native void SetOutputScalarTypeToUnsignedChar_18();
  public void SetOutputScalarTypeToUnsignedChar()
  {
    SetOutputScalarTypeToUnsignedChar_18();
  }

  private native void SetOutputScalarTypeToChar_19();
  public void SetOutputScalarTypeToChar()
  {
    SetOutputScalarTypeToChar_19();
  }

  public vtkImageStencilToImage() { super(); }

  public vtkImageStencilToImage(long id) { super(id); }
  public native long   VTKInit();

}
