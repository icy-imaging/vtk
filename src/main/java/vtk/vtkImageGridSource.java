// java wrapper for vtkImageGridSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageGridSource extends vtkImageAlgorithm
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

  private native void SetGridSpacing_4(int id0,int id1,int id2);
  public void SetGridSpacing(int id0,int id1,int id2)
  {
    SetGridSpacing_4(id0,id1,id2);
  }

  private native void SetGridSpacing_5(int id0[]);
  public void SetGridSpacing(int id0[])
  {
    SetGridSpacing_5(id0);
  }

  private native int[] GetGridSpacing_6();
  public int[] GetGridSpacing()
  {
    return GetGridSpacing_6();
  }

  private native void SetGridOrigin_7(int id0,int id1,int id2);
  public void SetGridOrigin(int id0,int id1,int id2)
  {
    SetGridOrigin_7(id0,id1,id2);
  }

  private native void SetGridOrigin_8(int id0[]);
  public void SetGridOrigin(int id0[])
  {
    SetGridOrigin_8(id0);
  }

  private native int[] GetGridOrigin_9();
  public int[] GetGridOrigin()
  {
    return GetGridOrigin_9();
  }

  private native void SetLineValue_10(double id0);
  public void SetLineValue(double id0)
  {
    SetLineValue_10(id0);
  }

  private native double GetLineValue_11();
  public double GetLineValue()
  {
    return GetLineValue_11();
  }

  private native void SetFillValue_12(double id0);
  public void SetFillValue(double id0)
  {
    SetFillValue_12(id0);
  }

  private native double GetFillValue_13();
  public double GetFillValue()
  {
    return GetFillValue_13();
  }

  private native void SetDataScalarType_14(int id0);
  public void SetDataScalarType(int id0)
  {
    SetDataScalarType_14(id0);
  }

  private native void SetDataScalarTypeToDouble_15();
  public void SetDataScalarTypeToDouble()
  {
    SetDataScalarTypeToDouble_15();
  }

  private native void SetDataScalarTypeToInt_16();
  public void SetDataScalarTypeToInt()
  {
    SetDataScalarTypeToInt_16();
  }

  private native void SetDataScalarTypeToShort_17();
  public void SetDataScalarTypeToShort()
  {
    SetDataScalarTypeToShort_17();
  }

  private native void SetDataScalarTypeToUnsignedShort_18();
  public void SetDataScalarTypeToUnsignedShort()
  {
    SetDataScalarTypeToUnsignedShort_18();
  }

  private native void SetDataScalarTypeToUnsignedChar_19();
  public void SetDataScalarTypeToUnsignedChar()
  {
    SetDataScalarTypeToUnsignedChar_19();
  }

  private native int GetDataScalarType_20();
  public int GetDataScalarType()
  {
    return GetDataScalarType_20();
  }

  private native byte[] GetDataScalarTypeAsString_21();
  public String GetDataScalarTypeAsString()
  {
    return new String(GetDataScalarTypeAsString_21(), StandardCharsets.UTF_8);
  }

  private native void SetDataExtent_22(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetDataExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetDataExtent_22(id0,id1,id2,id3,id4,id5);
  }

  private native void SetDataExtent_23(int id0[]);
  public void SetDataExtent(int id0[])
  {
    SetDataExtent_23(id0);
  }

  private native int[] GetDataExtent_24();
  public int[] GetDataExtent()
  {
    return GetDataExtent_24();
  }

  private native void SetDataSpacing_25(double id0,double id1,double id2);
  public void SetDataSpacing(double id0,double id1,double id2)
  {
    SetDataSpacing_25(id0,id1,id2);
  }

  private native void SetDataSpacing_26(double id0[]);
  public void SetDataSpacing(double id0[])
  {
    SetDataSpacing_26(id0);
  }

  private native double[] GetDataSpacing_27();
  public double[] GetDataSpacing()
  {
    return GetDataSpacing_27();
  }

  private native void SetDataOrigin_28(double id0,double id1,double id2);
  public void SetDataOrigin(double id0,double id1,double id2)
  {
    SetDataOrigin_28(id0,id1,id2);
  }

  private native void SetDataOrigin_29(double id0[]);
  public void SetDataOrigin(double id0[])
  {
    SetDataOrigin_29(id0);
  }

  private native double[] GetDataOrigin_30();
  public double[] GetDataOrigin()
  {
    return GetDataOrigin_30();
  }

  public vtkImageGridSource() { super(); }

  public vtkImageGridSource(long id) { super(id); }
  public native long   VTKInit();

}
