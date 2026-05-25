// java wrapper for vtkPolyPointSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyPointSource extends vtkPolyDataAlgorithm
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

  private native void SetNumberOfPoints_4(long id0);
  public void SetNumberOfPoints(long id0)
  {
    SetNumberOfPoints_4(id0);
  }

  private native long GetNumberOfPoints_5();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_5();
  }

  private native void Resize_6(long id0);
  public void Resize(long id0)
  {
    Resize_6(id0);
  }

  private native void SetPoint_7(long id0,double id1,double id2,double id3);
  public void SetPoint(long id0,double id1,double id2,double id3)
  {
    SetPoint_7(id0,id1,id2,id3);
  }

  private native void SetPoints_8(vtkPoints id0);
  public void SetPoints(vtkPoints id0)
  {
    SetPoints_8(id0);
  }

  private native long GetPoints_9();
  public vtkPoints GetPoints()
  {
    long temp = GetPoints_9();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_10();
  public long GetMTime()
  {
    return GetMTime_10();
  }

  public vtkPolyPointSource() { super(); }

  public vtkPolyPointSource(long id) { super(id); }
  public native long   VTKInit();

}
