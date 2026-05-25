// java wrapper for vtkPTSReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPTSReader extends vtkPolyDataAlgorithm
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native void LimitReadToBoundsOn_6();
  public void LimitReadToBoundsOn()
  {
    LimitReadToBoundsOn_6();
  }

  private native void LimitReadToBoundsOff_7();
  public void LimitReadToBoundsOff()
  {
    LimitReadToBoundsOff_7();
  }

  private native void SetLimitReadToBounds_8(boolean id0);
  public void SetLimitReadToBounds(boolean id0)
  {
    SetLimitReadToBounds_8(id0);
  }

  private native boolean GetLimitReadToBounds_9();
  public boolean GetLimitReadToBounds()
  {
    return GetLimitReadToBounds_9();
  }

  private native void SetReadBounds_10(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetReadBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetReadBounds_10(id0,id1,id2,id3,id4,id5);
  }

  private native void SetReadBounds_11(double id0[]);
  public void SetReadBounds(double id0[])
  {
    SetReadBounds_11(id0);
  }

  private native double[] GetReadBounds_12();
  public double[] GetReadBounds()
  {
    return GetReadBounds_12();
  }

  private native void OutputDataTypeIsDoubleOn_13();
  public void OutputDataTypeIsDoubleOn()
  {
    OutputDataTypeIsDoubleOn_13();
  }

  private native void OutputDataTypeIsDoubleOff_14();
  public void OutputDataTypeIsDoubleOff()
  {
    OutputDataTypeIsDoubleOff_14();
  }

  private native void SetOutputDataTypeIsDouble_15(boolean id0);
  public void SetOutputDataTypeIsDouble(boolean id0)
  {
    SetOutputDataTypeIsDouble_15(id0);
  }

  private native boolean GetOutputDataTypeIsDouble_16();
  public boolean GetOutputDataTypeIsDouble()
  {
    return GetOutputDataTypeIsDouble_16();
  }

  private native void LimitToMaxNumberOfPointsOn_17();
  public void LimitToMaxNumberOfPointsOn()
  {
    LimitToMaxNumberOfPointsOn_17();
  }

  private native void LimitToMaxNumberOfPointsOff_18();
  public void LimitToMaxNumberOfPointsOff()
  {
    LimitToMaxNumberOfPointsOff_18();
  }

  private native void SetLimitToMaxNumberOfPoints_19(boolean id0);
  public void SetLimitToMaxNumberOfPoints(boolean id0)
  {
    SetLimitToMaxNumberOfPoints_19(id0);
  }

  private native boolean GetLimitToMaxNumberOfPoints_20();
  public boolean GetLimitToMaxNumberOfPoints()
  {
    return GetLimitToMaxNumberOfPoints_20();
  }

  private native void SetMaxNumberOfPoints_21(long id0);
  public void SetMaxNumberOfPoints(long id0)
  {
    SetMaxNumberOfPoints_21(id0);
  }

  private native long GetMaxNumberOfPointsMinValue_22();
  public long GetMaxNumberOfPointsMinValue()
  {
    return GetMaxNumberOfPointsMinValue_22();
  }

  private native long GetMaxNumberOfPointsMaxValue_23();
  public long GetMaxNumberOfPointsMaxValue()
  {
    return GetMaxNumberOfPointsMaxValue_23();
  }

  private native long GetMaxNumberOfPoints_24();
  public long GetMaxNumberOfPoints()
  {
    return GetMaxNumberOfPoints_24();
  }

  private native void CreateCellsOn_25();
  public void CreateCellsOn()
  {
    CreateCellsOn_25();
  }

  private native void CreateCellsOff_26();
  public void CreateCellsOff()
  {
    CreateCellsOff_26();
  }

  private native void SetCreateCells_27(boolean id0);
  public void SetCreateCells(boolean id0)
  {
    SetCreateCells_27(id0);
  }

  private native boolean GetCreateCells_28();
  public boolean GetCreateCells()
  {
    return GetCreateCells_28();
  }

  private native void IncludeColorAndLuminanceOn_29();
  public void IncludeColorAndLuminanceOn()
  {
    IncludeColorAndLuminanceOn_29();
  }

  private native void IncludeColorAndLuminanceOff_30();
  public void IncludeColorAndLuminanceOff()
  {
    IncludeColorAndLuminanceOff_30();
  }

  private native void SetIncludeColorAndLuminance_31(boolean id0);
  public void SetIncludeColorAndLuminance(boolean id0)
  {
    SetIncludeColorAndLuminance_31(id0);
  }

  private native boolean GetIncludeColorAndLuminance_32();
  public boolean GetIncludeColorAndLuminance()
  {
    return GetIncludeColorAndLuminance_32();
  }

  public vtkPTSReader() { super(); }

  public vtkPTSReader(long id) { super(id); }
  public native long   VTKInit();

}
