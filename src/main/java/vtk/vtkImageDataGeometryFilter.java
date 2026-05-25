// java wrapper for vtkImageDataGeometryFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageDataGeometryFilter extends vtkPolyDataAlgorithm
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

  private native void SetExtent_4(int id0[]);
  public void SetExtent(int id0[])
  {
    SetExtent_4(id0);
  }

  private native void SetExtent_5(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetExtent_5(id0,id1,id2,id3,id4,id5);
  }

  private native int[] GetExtent_6();
  public int[] GetExtent()
  {
    return GetExtent_6();
  }

  private native void SetThresholdCells_7(int id0);
  public void SetThresholdCells(int id0)
  {
    SetThresholdCells_7(id0);
  }

  private native int GetThresholdCells_8();
  public int GetThresholdCells()
  {
    return GetThresholdCells_8();
  }

  private native void ThresholdCellsOn_9();
  public void ThresholdCellsOn()
  {
    ThresholdCellsOn_9();
  }

  private native void ThresholdCellsOff_10();
  public void ThresholdCellsOff()
  {
    ThresholdCellsOff_10();
  }

  private native void SetThresholdValue_11(double id0);
  public void SetThresholdValue(double id0)
  {
    SetThresholdValue_11(id0);
  }

  private native double GetThresholdValue_12();
  public double GetThresholdValue()
  {
    return GetThresholdValue_12();
  }

  private native void ThresholdValueOn_13();
  public void ThresholdValueOn()
  {
    ThresholdValueOn_13();
  }

  private native void ThresholdValueOff_14();
  public void ThresholdValueOff()
  {
    ThresholdValueOff_14();
  }

  private native void SetOutputTriangles_15(int id0);
  public void SetOutputTriangles(int id0)
  {
    SetOutputTriangles_15(id0);
  }

  private native int GetOutputTriangles_16();
  public int GetOutputTriangles()
  {
    return GetOutputTriangles_16();
  }

  private native void OutputTrianglesOn_17();
  public void OutputTrianglesOn()
  {
    OutputTrianglesOn_17();
  }

  private native void OutputTrianglesOff_18();
  public void OutputTrianglesOff()
  {
    OutputTrianglesOff_18();
  }

  public vtkImageDataGeometryFilter() { super(); }

  public vtkImageDataGeometryFilter(long id) { super(id); }
  public native long   VTKInit();

}
