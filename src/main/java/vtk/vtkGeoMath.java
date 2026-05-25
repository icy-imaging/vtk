// java wrapper for vtkGeoMath object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGeoMath extends vtkObject
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

  private native double EarthRadiusMeters_4();
  public double EarthRadiusMeters()
  {
    return EarthRadiusMeters_4();
  }

  private native double DistanceSquared_5(double id0[],double id1[]);
  public double DistanceSquared(double id0[],double id1[])
  {
    return DistanceSquared_5(id0,id1);
  }

  private native void LongLatAltToRect_6(double id0[],double id1[]);
  public void LongLatAltToRect(double id0[],double id1[])
  {
    LongLatAltToRect_6(id0,id1);
  }

  public vtkGeoMath() { super(); }

  public vtkGeoMath(long id) { super(id); }
  public native long   VTKInit();

}
