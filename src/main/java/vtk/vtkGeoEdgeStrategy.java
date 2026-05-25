// java wrapper for vtkGeoEdgeStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGeoEdgeStrategy extends vtkEdgeLayoutStrategy
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

  private native void SetGlobeRadius_4(double id0);
  public void SetGlobeRadius(double id0)
  {
    SetGlobeRadius_4(id0);
  }

  private native double GetGlobeRadius_5();
  public double GetGlobeRadius()
  {
    return GetGlobeRadius_5();
  }

  private native void SetExplodeFactor_6(double id0);
  public void SetExplodeFactor(double id0)
  {
    SetExplodeFactor_6(id0);
  }

  private native double GetExplodeFactor_7();
  public double GetExplodeFactor()
  {
    return GetExplodeFactor_7();
  }

  private native void SetNumberOfSubdivisions_8(int id0);
  public void SetNumberOfSubdivisions(int id0)
  {
    SetNumberOfSubdivisions_8(id0);
  }

  private native int GetNumberOfSubdivisions_9();
  public int GetNumberOfSubdivisions()
  {
    return GetNumberOfSubdivisions_9();
  }

  private native void Layout_10();
  public void Layout()
  {
    Layout_10();
  }

  public vtkGeoEdgeStrategy() { super(); }

  public vtkGeoEdgeStrategy(long id) { super(id); }
  public native long   VTKInit();

}
