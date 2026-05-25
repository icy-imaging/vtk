// java wrapper for vtkAppendLocationAttributes object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAppendLocationAttributes extends vtkPassInputTypeAlgorithm
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

  private native void SetAppendPointLocations_4(boolean id0);
  public void SetAppendPointLocations(boolean id0)
  {
    SetAppendPointLocations_4(id0);
  }

  private native boolean GetAppendPointLocations_5();
  public boolean GetAppendPointLocations()
  {
    return GetAppendPointLocations_5();
  }

  private native void AppendPointLocationsOn_6();
  public void AppendPointLocationsOn()
  {
    AppendPointLocationsOn_6();
  }

  private native void AppendPointLocationsOff_7();
  public void AppendPointLocationsOff()
  {
    AppendPointLocationsOff_7();
  }

  private native void SetAppendCellCenters_8(boolean id0);
  public void SetAppendCellCenters(boolean id0)
  {
    SetAppendCellCenters_8(id0);
  }

  private native boolean GetAppendCellCenters_9();
  public boolean GetAppendCellCenters()
  {
    return GetAppendCellCenters_9();
  }

  private native void AppendCellCentersOn_10();
  public void AppendCellCentersOn()
  {
    AppendCellCentersOn_10();
  }

  private native void AppendCellCentersOff_11();
  public void AppendCellCentersOff()
  {
    AppendCellCentersOff_11();
  }

  public vtkAppendLocationAttributes() { super(); }

  public vtkAppendLocationAttributes(long id) { super(id); }
  public native long   VTKInit();

}
