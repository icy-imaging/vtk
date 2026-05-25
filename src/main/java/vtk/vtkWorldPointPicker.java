// java wrapper for vtkWorldPointPicker object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWorldPointPicker extends vtkAbstractPicker
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

  private native int Pick_4(double id0,double id1,double id2,vtkRenderer id3);
  public int Pick(double id0,double id1,double id2,vtkRenderer id3)
  {
    return Pick_4(id0,id1,id2,id3);
  }

  private native int Pick_5(double id0[],vtkRenderer id1);
  public int Pick(double id0[],vtkRenderer id1)
  {
    return Pick_5(id0,id1);
  }

  public vtkWorldPointPicker() { super(); }

  public vtkWorldPointPicker(long id) { super(id); }
  public native long   VTKInit();

}
