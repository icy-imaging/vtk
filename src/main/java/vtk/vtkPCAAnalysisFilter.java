// java wrapper for vtkPCAAnalysisFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPCAAnalysisFilter extends vtkMultiBlockDataSetAlgorithm
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

  private native long GetEvals_4();
  public vtkFloatArray GetEvals()
  {
    long temp = GetEvals_4();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetParameterisedShape_5(vtkFloatArray id0,vtkPointSet id1);
  public void GetParameterisedShape(vtkFloatArray id0,vtkPointSet id1)
  {
    GetParameterisedShape_5(id0,id1);
  }

  private native void GetShapeParameters_6(vtkPointSet id0,vtkFloatArray id1,int id2);
  public void GetShapeParameters(vtkPointSet id0,vtkFloatArray id1,int id2)
  {
    GetShapeParameters_6(id0,id1,id2);
  }

  private native int GetModesRequiredFor_7(double id0);
  public int GetModesRequiredFor(double id0)
  {
    return GetModesRequiredFor_7(id0);
  }

  public vtkPCAAnalysisFilter() { super(); }

  public vtkPCAAnalysisFilter(long id) { super(id); }
  public native long   VTKInit();

}
