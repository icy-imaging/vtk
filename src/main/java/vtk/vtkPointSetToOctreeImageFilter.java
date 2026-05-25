// java wrapper for vtkPointSetToOctreeImageFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointSetToOctreeImageFilter extends vtkPartitionedDataSetAlgorithm
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

  private native void SetNumberOfPointsPerCell_4(int id0);
  public void SetNumberOfPointsPerCell(int id0)
  {
    SetNumberOfPointsPerCell_4(id0);
  }

  private native int GetNumberOfPointsPerCellMinValue_5();
  public int GetNumberOfPointsPerCellMinValue()
  {
    return GetNumberOfPointsPerCellMinValue_5();
  }

  private native int GetNumberOfPointsPerCellMaxValue_6();
  public int GetNumberOfPointsPerCellMaxValue()
  {
    return GetNumberOfPointsPerCellMaxValue_6();
  }

  private native int GetNumberOfPointsPerCell_7();
  public int GetNumberOfPointsPerCell()
  {
    return GetNumberOfPointsPerCell_7();
  }

  private native void SetProcessInputPointArray_8(boolean id0);
  public void SetProcessInputPointArray(boolean id0)
  {
    SetProcessInputPointArray_8(id0);
  }

  private native boolean GetProcessInputPointArray_9();
  public boolean GetProcessInputPointArray()
  {
    return GetProcessInputPointArray_9();
  }

  private native void ProcessInputPointArrayOn_10();
  public void ProcessInputPointArrayOn()
  {
    ProcessInputPointArrayOn_10();
  }

  private native void ProcessInputPointArrayOff_11();
  public void ProcessInputPointArrayOff()
  {
    ProcessInputPointArrayOff_11();
  }

  private native void SetComputeLastValue_12(boolean id0);
  public void SetComputeLastValue(boolean id0)
  {
    SetComputeLastValue_12(id0);
  }

  private native boolean GetComputeLastValue_13();
  public boolean GetComputeLastValue()
  {
    return GetComputeLastValue_13();
  }

  private native void ComputeLastValueOn_14();
  public void ComputeLastValueOn()
  {
    ComputeLastValueOn_14();
  }

  private native void ComputeLastValueOff_15();
  public void ComputeLastValueOff()
  {
    ComputeLastValueOff_15();
  }

  private native void SetComputeMin_16(boolean id0);
  public void SetComputeMin(boolean id0)
  {
    SetComputeMin_16(id0);
  }

  private native boolean GetComputeMin_17();
  public boolean GetComputeMin()
  {
    return GetComputeMin_17();
  }

  private native void ComputeMinOn_18();
  public void ComputeMinOn()
  {
    ComputeMinOn_18();
  }

  private native void ComputeMinOff_19();
  public void ComputeMinOff()
  {
    ComputeMinOff_19();
  }

  private native void SetComputeMax_20(boolean id0);
  public void SetComputeMax(boolean id0)
  {
    SetComputeMax_20(id0);
  }

  private native boolean GetComputeMax_21();
  public boolean GetComputeMax()
  {
    return GetComputeMax_21();
  }

  private native void ComputeMaxOn_22();
  public void ComputeMaxOn()
  {
    ComputeMaxOn_22();
  }

  private native void ComputeMaxOff_23();
  public void ComputeMaxOff()
  {
    ComputeMaxOff_23();
  }

  private native void SetComputeCount_24(boolean id0);
  public void SetComputeCount(boolean id0)
  {
    SetComputeCount_24(id0);
  }

  private native boolean GetComputeCount_25();
  public boolean GetComputeCount()
  {
    return GetComputeCount_25();
  }

  private native void ComputeCountOn_26();
  public void ComputeCountOn()
  {
    ComputeCountOn_26();
  }

  private native void ComputeCountOff_27();
  public void ComputeCountOff()
  {
    ComputeCountOff_27();
  }

  private native void SetComputeSum_28(boolean id0);
  public void SetComputeSum(boolean id0)
  {
    SetComputeSum_28(id0);
  }

  private native boolean GetComputeSum_29();
  public boolean GetComputeSum()
  {
    return GetComputeSum_29();
  }

  private native void ComputeSumOn_30();
  public void ComputeSumOn()
  {
    ComputeSumOn_30();
  }

  private native void ComputeSumOff_31();
  public void ComputeSumOff()
  {
    ComputeSumOff_31();
  }

  private native void SetComputeMean_32(boolean id0);
  public void SetComputeMean(boolean id0)
  {
    SetComputeMean_32(id0);
  }

  private native boolean GetComputeMean_33();
  public boolean GetComputeMean()
  {
    return GetComputeMean_33();
  }

  private native void ComputeMeanOn_34();
  public void ComputeMeanOn()
  {
    ComputeMeanOn_34();
  }

  private native void ComputeMeanOff_35();
  public void ComputeMeanOff()
  {
    ComputeMeanOff_35();
  }

  public vtkPointSetToOctreeImageFilter() { super(); }

  public vtkPointSetToOctreeImageFilter(long id) { super(id); }
  public native long   VTKInit();

}
