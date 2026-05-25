// java wrapper for vtkImageSlab object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageSlab extends vtkThreadedImageAlgorithm
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

  private native void SetOrientation_4(int id0);
  public void SetOrientation(int id0)
  {
    SetOrientation_4(id0);
  }

  private native int GetOrientationMinValue_5();
  public int GetOrientationMinValue()
  {
    return GetOrientationMinValue_5();
  }

  private native int GetOrientationMaxValue_6();
  public int GetOrientationMaxValue()
  {
    return GetOrientationMaxValue_6();
  }

  private native void SetOrientationToX_7();
  public void SetOrientationToX()
  {
    SetOrientationToX_7();
  }

  private native void SetOrientationToY_8();
  public void SetOrientationToY()
  {
    SetOrientationToY_8();
  }

  private native void SetOrientationToZ_9();
  public void SetOrientationToZ()
  {
    SetOrientationToZ_9();
  }

  private native int GetOrientation_10();
  public int GetOrientation()
  {
    return GetOrientation_10();
  }

  private native void SetSliceRange_11(int id0,int id1);
  public void SetSliceRange(int id0,int id1)
  {
    SetSliceRange_11(id0,id1);
  }

  private native void SetSliceRange_12(int id0[]);
  public void SetSliceRange(int id0[])
  {
    SetSliceRange_12(id0);
  }

  private native int[] GetSliceRange_13();
  public int[] GetSliceRange()
  {
    return GetSliceRange_13();
  }

  private native void SetOperation_14(int id0);
  public void SetOperation(int id0)
  {
    SetOperation_14(id0);
  }

  private native int GetOperationMinValue_15();
  public int GetOperationMinValue()
  {
    return GetOperationMinValue_15();
  }

  private native int GetOperationMaxValue_16();
  public int GetOperationMaxValue()
  {
    return GetOperationMaxValue_16();
  }

  private native void SetOperationToMin_17();
  public void SetOperationToMin()
  {
    SetOperationToMin_17();
  }

  private native void SetOperationToMax_18();
  public void SetOperationToMax()
  {
    SetOperationToMax_18();
  }

  private native void SetOperationToMean_19();
  public void SetOperationToMean()
  {
    SetOperationToMean_19();
  }

  private native void SetOperationToSum_20();
  public void SetOperationToSum()
  {
    SetOperationToSum_20();
  }

  private native int GetOperation_21();
  public int GetOperation()
  {
    return GetOperation_21();
  }

  private native byte[] GetOperationAsString_22();
  public String GetOperationAsString()
  {
    return new String(GetOperationAsString_22(), StandardCharsets.UTF_8);
  }

  private native void SetTrapezoidIntegration_23(int id0);
  public void SetTrapezoidIntegration(int id0)
  {
    SetTrapezoidIntegration_23(id0);
  }

  private native void TrapezoidIntegrationOn_24();
  public void TrapezoidIntegrationOn()
  {
    TrapezoidIntegrationOn_24();
  }

  private native void TrapezoidIntegrationOff_25();
  public void TrapezoidIntegrationOff()
  {
    TrapezoidIntegrationOff_25();
  }

  private native int GetTrapezoidIntegration_26();
  public int GetTrapezoidIntegration()
  {
    return GetTrapezoidIntegration_26();
  }

  private native void SetMultiSliceOutput_27(int id0);
  public void SetMultiSliceOutput(int id0)
  {
    SetMultiSliceOutput_27(id0);
  }

  private native void MultiSliceOutputOn_28();
  public void MultiSliceOutputOn()
  {
    MultiSliceOutputOn_28();
  }

  private native void MultiSliceOutputOff_29();
  public void MultiSliceOutputOff()
  {
    MultiSliceOutputOff_29();
  }

  private native int GetMultiSliceOutput_30();
  public int GetMultiSliceOutput()
  {
    return GetMultiSliceOutput_30();
  }

  private native void SetOutputScalarTypeToFloat_31();
  public void SetOutputScalarTypeToFloat()
  {
    SetOutputScalarTypeToFloat_31();
  }

  private native void SetOutputScalarTypeToDouble_32();
  public void SetOutputScalarTypeToDouble()
  {
    SetOutputScalarTypeToDouble_32();
  }

  private native void SetOutputScalarTypeToInputScalarType_33();
  public void SetOutputScalarTypeToInputScalarType()
  {
    SetOutputScalarTypeToInputScalarType_33();
  }

  private native int GetOutputScalarType_34();
  public int GetOutputScalarType()
  {
    return GetOutputScalarType_34();
  }

  public vtkImageSlab() { super(); }

  public vtkImageSlab(long id) { super(id); }
  public native long   VTKInit();

}
