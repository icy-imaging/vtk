// java wrapper for vtkUnstructuredGridLinearRayIntegrator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUnstructuredGridLinearRayIntegrator extends vtkUnstructuredGridVolumeRayIntegrator
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

  private native void Initialize_4(vtkVolume id0,vtkDataArray id1);
  public void Initialize(vtkVolume id0,vtkDataArray id1)
  {
    Initialize_4(id0,id1);
  }

  private native void Integrate_5(vtkDoubleArray id0,vtkDataArray id1,vtkDataArray id2,float id3[]);
  public void Integrate(vtkDoubleArray id0,vtkDataArray id1,vtkDataArray id2,float id3[])
  {
    Integrate_5(id0,id1,id2,id3);
  }

  private native void IntegrateRay_6(double id0,double id1,double id2,double id3,double id4,float id5[]);
  public void IntegrateRay(double id0,double id1,double id2,double id3,double id4,float id5[])
  {
    IntegrateRay_6(id0,id1,id2,id3,id4,id5);
  }

  private native void IntegrateRay_7(double id0,double id1[],double id2,double id3[],double id4,float id5[]);
  public void IntegrateRay(double id0,double id1[],double id2,double id3[],double id4,float id5[])
  {
    IntegrateRay_7(id0,id1,id2,id3,id4,id5);
  }

  private native float Psi_8(float id0,float id1,float id2);
  public float Psi(float id0,float id1,float id2)
  {
    return Psi_8(id0,id1,id2);
  }

  public vtkUnstructuredGridLinearRayIntegrator() { super(); }

  public vtkUnstructuredGridLinearRayIntegrator(long id) { super(id); }
  public native long   VTKInit();

}
