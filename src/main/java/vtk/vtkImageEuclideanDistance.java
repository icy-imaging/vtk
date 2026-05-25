// java wrapper for vtkImageEuclideanDistance object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageEuclideanDistance extends vtkImageDecomposeFilter
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

  private native void SetInitialize_4(int id0);
  public void SetInitialize(int id0)
  {
    SetInitialize_4(id0);
  }

  private native int GetInitialize_5();
  public int GetInitialize()
  {
    return GetInitialize_5();
  }

  private native void InitializeOn_6();
  public void InitializeOn()
  {
    InitializeOn_6();
  }

  private native void InitializeOff_7();
  public void InitializeOff()
  {
    InitializeOff_7();
  }

  private native void SetConsiderAnisotropy_8(int id0);
  public void SetConsiderAnisotropy(int id0)
  {
    SetConsiderAnisotropy_8(id0);
  }

  private native int GetConsiderAnisotropy_9();
  public int GetConsiderAnisotropy()
  {
    return GetConsiderAnisotropy_9();
  }

  private native void ConsiderAnisotropyOn_10();
  public void ConsiderAnisotropyOn()
  {
    ConsiderAnisotropyOn_10();
  }

  private native void ConsiderAnisotropyOff_11();
  public void ConsiderAnisotropyOff()
  {
    ConsiderAnisotropyOff_11();
  }

  private native void SetMaximumDistance_12(double id0);
  public void SetMaximumDistance(double id0)
  {
    SetMaximumDistance_12(id0);
  }

  private native double GetMaximumDistance_13();
  public double GetMaximumDistance()
  {
    return GetMaximumDistance_13();
  }

  private native void SetAlgorithm_14(int id0);
  public void SetAlgorithm(int id0)
  {
    SetAlgorithm_14(id0);
  }

  private native int GetAlgorithm_15();
  public int GetAlgorithm()
  {
    return GetAlgorithm_15();
  }

  private native void SetAlgorithmToSaito_16();
  public void SetAlgorithmToSaito()
  {
    SetAlgorithmToSaito_16();
  }

  private native void SetAlgorithmToSaitoCached_17();
  public void SetAlgorithmToSaitoCached()
  {
    SetAlgorithmToSaitoCached_17();
  }

  public vtkImageEuclideanDistance() { super(); }

  public vtkImageEuclideanDistance(long id) { super(id); }
  public native long   VTKInit();

}
