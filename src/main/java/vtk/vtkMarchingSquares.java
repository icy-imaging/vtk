// java wrapper for vtkMarchingSquares object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMarchingSquares extends vtkPolyDataAlgorithm
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

  private native int[] GetImageRange_4();
  public int[] GetImageRange()
  {
    return GetImageRange_4();
  }

  private native void SetImageRange_5(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetImageRange(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetImageRange_5(id0,id1,id2,id3,id4,id5);
  }

  private native void SetValue_6(int id0,double id1);
  public void SetValue(int id0,double id1)
  {
    SetValue_6(id0,id1);
  }

  private native double GetValue_7(int id0);
  public double GetValue(int id0)
  {
    return GetValue_7(id0);
  }

  private native void SetNumberOfContours_8(int id0);
  public void SetNumberOfContours(int id0)
  {
    SetNumberOfContours_8(id0);
  }

  private native long GetNumberOfContours_9();
  public long GetNumberOfContours()
  {
    return GetNumberOfContours_9();
  }

  private native void GenerateValues_10(int id0,double id1[]);
  public void GenerateValues(int id0,double id1[])
  {
    GenerateValues_10(id0,id1);
  }

  private native void GenerateValues_11(int id0,double id1,double id2);
  public void GenerateValues(int id0,double id1,double id2)
  {
    GenerateValues_11(id0,id1,id2);
  }

  private native long GetMTime_12();
  public long GetMTime()
  {
    return GetMTime_12();
  }

  private native void SetLocator_13(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_13(id0);
  }

  private native long GetLocator_14();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_14();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_15();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_15();
  }

  public vtkMarchingSquares() { super(); }

  public vtkMarchingSquares(long id) { super(id); }
  public native long   VTKInit();

}
