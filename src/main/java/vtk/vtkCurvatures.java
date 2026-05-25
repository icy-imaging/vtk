// java wrapper for vtkCurvatures object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCurvatures extends vtkPolyDataAlgorithm
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

  private native void SetCurvatureType_4(int id0);
  public void SetCurvatureType(int id0)
  {
    SetCurvatureType_4(id0);
  }

  private native int GetCurvatureType_5();
  public int GetCurvatureType()
  {
    return GetCurvatureType_5();
  }

  private native void SetCurvatureTypeToGaussian_6();
  public void SetCurvatureTypeToGaussian()
  {
    SetCurvatureTypeToGaussian_6();
  }

  private native void SetCurvatureTypeToMean_7();
  public void SetCurvatureTypeToMean()
  {
    SetCurvatureTypeToMean_7();
  }

  private native void SetCurvatureTypeToMaximum_8();
  public void SetCurvatureTypeToMaximum()
  {
    SetCurvatureTypeToMaximum_8();
  }

  private native void SetCurvatureTypeToMinimum_9();
  public void SetCurvatureTypeToMinimum()
  {
    SetCurvatureTypeToMinimum_9();
  }

  private native void SetInvertMeanCurvature_10(int id0);
  public void SetInvertMeanCurvature(int id0)
  {
    SetInvertMeanCurvature_10(id0);
  }

  private native int GetInvertMeanCurvature_11();
  public int GetInvertMeanCurvature()
  {
    return GetInvertMeanCurvature_11();
  }

  private native void InvertMeanCurvatureOn_12();
  public void InvertMeanCurvatureOn()
  {
    InvertMeanCurvatureOn_12();
  }

  private native void InvertMeanCurvatureOff_13();
  public void InvertMeanCurvatureOff()
  {
    InvertMeanCurvatureOff_13();
  }

  public vtkCurvatures() { super(); }

  public vtkCurvatures(long id) { super(id); }
  public native long   VTKInit();

}
