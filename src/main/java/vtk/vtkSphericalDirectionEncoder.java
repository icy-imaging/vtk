// java wrapper for vtkSphericalDirectionEncoder object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSphericalDirectionEncoder extends vtkDirectionEncoder
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

  private native int GetEncodedDirection_4(float id0[]);
  public int GetEncodedDirection(float id0[])
  {
    return GetEncodedDirection_4(id0);
  }

  private native float[] GetDecodedGradient_5(int id0);
  public float[] GetDecodedGradient(int id0)
  {
    return GetDecodedGradient_5(id0);
  }

  private native int GetNumberOfEncodedDirections_6();
  public int GetNumberOfEncodedDirections()
  {
    return GetNumberOfEncodedDirections_6();
  }

  public vtkSphericalDirectionEncoder() { super(); }

  public vtkSphericalDirectionEncoder(long id) { super(id); }
  public native long   VTKInit();

}
