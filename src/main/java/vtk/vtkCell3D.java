// java wrapper for vtkCell3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCell3D extends vtkCell
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

  private native boolean IsInsideOut_4();
  public boolean IsInsideOut()
  {
    return IsInsideOut_4();
  }

  private native boolean GetCentroid_5(double id0[]);
  public boolean GetCentroid(double id0[])
  {
    return GetCentroid_5(id0);
  }

  private native void Contour_6(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10);
  public void Contour(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10)
  {
    Contour_6(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10);
  }

  private native void Clip_7(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9);
  public void Clip(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9)
  {
    Clip_7(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native int GetCellDimension_8();
  public int GetCellDimension()
  {
    return GetCellDimension_8();
  }

  private native int Inflate_9(double id0);
  public int Inflate(double id0)
  {
    return Inflate_9(id0);
  }

  private native void SetMergeTolerance_10(double id0);
  public void SetMergeTolerance(double id0)
  {
    SetMergeTolerance_10(id0);
  }

  private native double GetMergeToleranceMinValue_11();
  public double GetMergeToleranceMinValue()
  {
    return GetMergeToleranceMinValue_11();
  }

  private native double GetMergeToleranceMaxValue_12();
  public double GetMergeToleranceMaxValue()
  {
    return GetMergeToleranceMaxValue_12();
  }

  private native double GetMergeTolerance_13();
  public double GetMergeTolerance()
  {
    return GetMergeTolerance_13();
  }

  public vtkCell3D() { super(); }

  public vtkCell3D(long id) { super(id); }

}
