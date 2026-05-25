// java wrapper for vtkImageEllipsoidSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageEllipsoidSource extends vtkImageAlgorithm
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

  private native void SetWholeExtent_4(int id0[]);
  public void SetWholeExtent(int id0[])
  {
    SetWholeExtent_4(id0);
  }

  private native void SetWholeExtent_5(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetWholeExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetWholeExtent_5(id0,id1,id2,id3,id4,id5);
  }

  private native void GetWholeExtent_6(int id0[]);
  public void GetWholeExtent(int id0[])
  {
    GetWholeExtent_6(id0);
  }

  private native int[] GetWholeExtent_7();
  public int[] GetWholeExtent()
  {
    return GetWholeExtent_7();
  }

  private native void SetCenter_8(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_8(id0,id1,id2);
  }

  private native void SetCenter_9(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_9(id0);
  }

  private native double[] GetCenter_10();
  public double[] GetCenter()
  {
    return GetCenter_10();
  }

  private native void SetRadius_11(double id0,double id1,double id2);
  public void SetRadius(double id0,double id1,double id2)
  {
    SetRadius_11(id0,id1,id2);
  }

  private native void SetRadius_12(double id0[]);
  public void SetRadius(double id0[])
  {
    SetRadius_12(id0);
  }

  private native double[] GetRadius_13();
  public double[] GetRadius()
  {
    return GetRadius_13();
  }

  private native void SetInValue_14(double id0);
  public void SetInValue(double id0)
  {
    SetInValue_14(id0);
  }

  private native double GetInValue_15();
  public double GetInValue()
  {
    return GetInValue_15();
  }

  private native void SetOutValue_16(double id0);
  public void SetOutValue(double id0)
  {
    SetOutValue_16(id0);
  }

  private native double GetOutValue_17();
  public double GetOutValue()
  {
    return GetOutValue_17();
  }

  private native void SetOutputScalarType_18(int id0);
  public void SetOutputScalarType(int id0)
  {
    SetOutputScalarType_18(id0);
  }

  private native int GetOutputScalarType_19();
  public int GetOutputScalarType()
  {
    return GetOutputScalarType_19();
  }

  private native void SetOutputScalarTypeToFloat_20();
  public void SetOutputScalarTypeToFloat()
  {
    SetOutputScalarTypeToFloat_20();
  }

  private native void SetOutputScalarTypeToDouble_21();
  public void SetOutputScalarTypeToDouble()
  {
    SetOutputScalarTypeToDouble_21();
  }

  private native void SetOutputScalarTypeToLong_22();
  public void SetOutputScalarTypeToLong()
  {
    SetOutputScalarTypeToLong_22();
  }

  private native void SetOutputScalarTypeToUnsignedLong_23();
  public void SetOutputScalarTypeToUnsignedLong()
  {
    SetOutputScalarTypeToUnsignedLong_23();
  }

  private native void SetOutputScalarTypeToInt_24();
  public void SetOutputScalarTypeToInt()
  {
    SetOutputScalarTypeToInt_24();
  }

  private native void SetOutputScalarTypeToUnsignedInt_25();
  public void SetOutputScalarTypeToUnsignedInt()
  {
    SetOutputScalarTypeToUnsignedInt_25();
  }

  private native void SetOutputScalarTypeToShort_26();
  public void SetOutputScalarTypeToShort()
  {
    SetOutputScalarTypeToShort_26();
  }

  private native void SetOutputScalarTypeToUnsignedShort_27();
  public void SetOutputScalarTypeToUnsignedShort()
  {
    SetOutputScalarTypeToUnsignedShort_27();
  }

  private native void SetOutputScalarTypeToChar_28();
  public void SetOutputScalarTypeToChar()
  {
    SetOutputScalarTypeToChar_28();
  }

  private native void SetOutputScalarTypeToUnsignedChar_29();
  public void SetOutputScalarTypeToUnsignedChar()
  {
    SetOutputScalarTypeToUnsignedChar_29();
  }

  public vtkImageEllipsoidSource() { super(); }

  public vtkImageEllipsoidSource(long id) { super(id); }
  public native long   VTKInit();

}
