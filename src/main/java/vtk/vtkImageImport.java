// java wrapper for vtkImageImport object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageImport extends vtkImageAlgorithm
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

  private native void SetDataScalarType_4(int id0);
  public void SetDataScalarType(int id0)
  {
    SetDataScalarType_4(id0);
  }

  private native void SetDataScalarTypeToDouble_5();
  public void SetDataScalarTypeToDouble()
  {
    SetDataScalarTypeToDouble_5();
  }

  private native void SetDataScalarTypeToFloat_6();
  public void SetDataScalarTypeToFloat()
  {
    SetDataScalarTypeToFloat_6();
  }

  private native void SetDataScalarTypeToInt_7();
  public void SetDataScalarTypeToInt()
  {
    SetDataScalarTypeToInt_7();
  }

  private native void SetDataScalarTypeToShort_8();
  public void SetDataScalarTypeToShort()
  {
    SetDataScalarTypeToShort_8();
  }

  private native void SetDataScalarTypeToUnsignedShort_9();
  public void SetDataScalarTypeToUnsignedShort()
  {
    SetDataScalarTypeToUnsignedShort_9();
  }

  private native void SetDataScalarTypeToUnsignedChar_10();
  public void SetDataScalarTypeToUnsignedChar()
  {
    SetDataScalarTypeToUnsignedChar_10();
  }

  private native int GetDataScalarType_11();
  public int GetDataScalarType()
  {
    return GetDataScalarType_11();
  }

  private native byte[] GetDataScalarTypeAsString_12();
  public String GetDataScalarTypeAsString()
  {
    return new String(GetDataScalarTypeAsString_12(), StandardCharsets.UTF_8);
  }

  private native void SetNumberOfScalarComponents_13(int id0);
  public void SetNumberOfScalarComponents(int id0)
  {
    SetNumberOfScalarComponents_13(id0);
  }

  private native int GetNumberOfScalarComponents_14();
  public int GetNumberOfScalarComponents()
  {
    return GetNumberOfScalarComponents_14();
  }

  private native void SetDataExtent_15(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetDataExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetDataExtent_15(id0,id1,id2,id3,id4,id5);
  }

  private native void SetDataExtent_16(int id0[]);
  public void SetDataExtent(int id0[])
  {
    SetDataExtent_16(id0);
  }

  private native int[] GetDataExtent_17();
  public int[] GetDataExtent()
  {
    return GetDataExtent_17();
  }

  private native void SetDataExtentToWholeExtent_18();
  public void SetDataExtentToWholeExtent()
  {
    SetDataExtentToWholeExtent_18();
  }

  private native void SetDataSpacing_19(double id0,double id1,double id2);
  public void SetDataSpacing(double id0,double id1,double id2)
  {
    SetDataSpacing_19(id0,id1,id2);
  }

  private native void SetDataSpacing_20(double id0[]);
  public void SetDataSpacing(double id0[])
  {
    SetDataSpacing_20(id0);
  }

  private native double[] GetDataSpacing_21();
  public double[] GetDataSpacing()
  {
    return GetDataSpacing_21();
  }

  private native void SetDataOrigin_22(double id0,double id1,double id2);
  public void SetDataOrigin(double id0,double id1,double id2)
  {
    SetDataOrigin_22(id0,id1,id2);
  }

  private native void SetDataOrigin_23(double id0[]);
  public void SetDataOrigin(double id0[])
  {
    SetDataOrigin_23(id0);
  }

  private native double[] GetDataOrigin_24();
  public double[] GetDataOrigin()
  {
    return GetDataOrigin_24();
  }

  private native double[] GetDataDirection_25();
  public double[] GetDataDirection()
  {
    return GetDataDirection_25();
  }

  private native void SetWholeExtent_26(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetWholeExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetWholeExtent_26(id0,id1,id2,id3,id4,id5);
  }

  private native void SetWholeExtent_27(int id0[]);
  public void SetWholeExtent(int id0[])
  {
    SetWholeExtent_27(id0);
  }

  private native int[] GetWholeExtent_28();
  public int[] GetWholeExtent()
  {
    return GetWholeExtent_28();
  }

  private native void SetScalarArrayName_29(byte[] id0, int len0);
  public void SetScalarArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScalarArrayName_29(bytes0, bytes0.length);
  }

  private native byte[] GetScalarArrayName_30();
  public String GetScalarArrayName()
  {
    return new String(GetScalarArrayName_30(), StandardCharsets.UTF_8);
  }

  private native int InvokePipelineModifiedCallbacks_31();
  public int InvokePipelineModifiedCallbacks()
  {
    return InvokePipelineModifiedCallbacks_31();
  }

  private native void InvokeUpdateInformationCallbacks_32();
  public void InvokeUpdateInformationCallbacks()
  {
    InvokeUpdateInformationCallbacks_32();
  }

  private native void InvokeExecuteInformationCallbacks_33();
  public void InvokeExecuteInformationCallbacks()
  {
    InvokeExecuteInformationCallbacks_33();
  }

  private native void InvokeExecuteDataCallbacks_34();
  public void InvokeExecuteDataCallbacks()
  {
    InvokeExecuteDataCallbacks_34();
  }

  private native void LegacyCheckWholeExtent_35();
  public void LegacyCheckWholeExtent()
  {
    LegacyCheckWholeExtent_35();
  }

  public vtkImageImport() { super(); }

  public vtkImageImport(long id) { super(id); }
  public native long   VTKInit();

}
