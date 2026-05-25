// java wrapper for vtkAssignCoordinatesLayoutStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAssignCoordinatesLayoutStrategy extends vtkGraphLayoutStrategy
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

  private native void SetXCoordArrayName_4(byte[] id0, int len0);
  public void SetXCoordArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXCoordArrayName_4(bytes0, bytes0.length);
  }

  private native byte[] GetXCoordArrayName_5();
  public String GetXCoordArrayName()
  {
    return new String(GetXCoordArrayName_5(), StandardCharsets.UTF_8);
  }

  private native void SetYCoordArrayName_6(byte[] id0, int len0);
  public void SetYCoordArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYCoordArrayName_6(bytes0, bytes0.length);
  }

  private native byte[] GetYCoordArrayName_7();
  public String GetYCoordArrayName()
  {
    return new String(GetYCoordArrayName_7(), StandardCharsets.UTF_8);
  }

  private native void SetZCoordArrayName_8(byte[] id0, int len0);
  public void SetZCoordArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetZCoordArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetZCoordArrayName_9();
  public String GetZCoordArrayName()
  {
    return new String(GetZCoordArrayName_9(), StandardCharsets.UTF_8);
  }

  private native void Layout_10();
  public void Layout()
  {
    Layout_10();
  }

  public vtkAssignCoordinatesLayoutStrategy() { super(); }

  public vtkAssignCoordinatesLayoutStrategy(long id) { super(id); }
  public native long   VTKInit();

}
